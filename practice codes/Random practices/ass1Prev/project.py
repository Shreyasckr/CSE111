    import pandas as pd
    import numpy as np
    import matplotlib.pyplot as plt
    import seaborn as sns
    from scipy.stats import gmean, hmean, pearsonr, linregress

    # 1. Load the Data (Replace with your actual file path if needed)
    data = """Farm_ID,Fertilizer_Type,Watering_Times,Soil_pH,Crop_Yield_kg_p
    1,2,2,7.49,251.9
    2,1,5,6.1,287.9
    3,1,3,5.92,244.6
    # ... Add the rest of the 100 rows here ...
    100,2,3,7.51,272.5"""

    # For the sake of this script, assume data is loaded into a DataFrame 'df'
    # df = pd.read_csv('your_dataset.csv') 

    # --- Q1, Q4, Q5, Q6: Summary Statistics ---
    variables = ['Watering_Times', 'Soil_pH', 'Crop_Yield_kg_p']
    summary_stats = pd.DataFrame(index=variables)

    summary_stats['Arithmetic_Mean'] = df[variables].mean()
    summary_stats['Geometric_Mean'] = [gmean(df[v]) if (df[v] > 0).all() else np.nan for v in variables]
    summary_stats['Harmonic_Mean'] = [hmean(df[v]) if (df[v] > 0).all() else np.nan for v in variables]
    summary_stats['Median'] = df[variables].median()
    summary_stats['Mode'] = df[variables].mode().iloc[0]
    summary_stats['Range'] = df[variables].max() - df[variables].min()
    summary_stats['IQR'] = df[variables].apply(lambda x: np.percentile(x, 75) - np.percentile(x, 25))
    summary_stats['Variance'] = df[variables].var()
    summary_stats['Standard_Deviation'] = df[variables].std()
    summary_stats['CV_(%)'] = (summary_stats['Standard_Deviation'] / summary_stats['Arithmetic_Mean']) * 100

    print("--- Central Tendencies, Dispersions, and CV ---")
    print(summary_stats.T)

    # --- Q2: Histogram, Polygon, Ogive ---
    for var in variables:
        fig, axes = plt.subplots(1, 3, figsize=(15, 4))
        
        # Histogram
        sns.histplot(df[var], bins=10, ax=axes[0], kde=False)
        axes[0].set_title(f'Histogram of {var}')
        
        # Frequency Polygon
        counts, bins = np.histogram(df[var], bins=10)
        bin_centers = 0.5 * (bins[:-1] + bins[1:])
        axes[1].plot(bin_centers, counts, marker='o')
        axes[1].set_title(f'Frequency Polygon of {var}')
        
        # Ogive (Cumulative)
        axes[2].plot(bins[:-1], np.cumsum(counts), marker='o')
        axes[2].set_title(f'Ogive of {var}')
        
        plt.tight_layout()
        plt.savefig(f'{var}_distributions.png')

    # --- Q3: Pie Chart for Fertilizer_Type ---
    plt.figure(figsize=(6,6))
    df['Fertilizer_Type'].map({1:'Organic', 2:'Chemical', 3:'Mixed'}).value_counts().plot.pie(autopct='%1.1f%%', startangle=90)
    plt.title('Fertilizer Type Distribution')
    plt.ylabel('')
    plt.savefig('Fertilizer_PieChart.png')

    # --- Q7: Five Number Summary & Boxplot ---
    print("\n--- Five Number Summary ---")
    print(df[variables].describe().loc[['min', '25%', '50%', '75%', 'max']])

    plt.figure(figsize=(10, 5))
    sns.boxplot(data=df[variables], orient='h')
    plt.title('Box and Whisker Plots')
    plt.savefig('Boxplots.png')

    # --- Q8: Correlations ---
    print("\n--- Correlations ---")
    print(df[variables].corr())

    # --- Q9 & Q10: Linear Regression ---
    print("\n--- Simple Linear Regression ---")
    slope, intercept, r_value, p_value, std_err = linregress(df['Watering_Times'], df['Crop_Yield_kg_p'])
    print(f"Yield ~ Watering: Yield = {intercept:.2f} + {slope:.2f}*(Watering_Times) | R-squared: {r_value**2:.4f}")

    slope, intercept, r_value, p_value, std_err = linregress(df['Soil_pH'], df['Crop_Yield_kg_p'])
    print(f"Yield ~ Soil_pH: Yield = {intercept:.2f} + {slope:.2f}*(Soil_pH) | R-squared: {r_value**2:.4f}")

    # Subgroup Regression Plot (Q10)
    sns.lmplot(x='Soil_pH', y='Crop_Yield_kg_p', hue='Fertilizer_Type', data=df, aspect=1.5)
    plt.title('Regression of Yield vs pH by Fertilizer Type')
    plt.savefig('Subgroup_Regression.png')
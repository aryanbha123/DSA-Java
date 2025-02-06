# # Step 1: Import Required Libraries
from sklearn.datasets import load_iris
# import pandas as pd
# from sklearn.model_selection import train_test_split
# from sklearn.linear_model import LogisticRegression
# from sklearn.metrics import accuracy_score, confusion_matrix, classification_report
# import seaborn as sns
# import matplotlib.pyplot as plt
import joblib

# # Step 2: Load the Dataset
iris = load_iris()
# df = pd.DataFrame(iris.data, columns=iris.feature_names)
# df['species'] = iris.target

# # Step 3: Explore the Data
# print("Dataset Shape:", df.shape)
# print("\nFirst 5 Rows:\n", df.head())
# print("\nMissing Values:\n", df.isnull().sum())
# print("\nSummary Statistics:\n", df.describe())
# print("\nSpecies Distribution:\n", df['species'].value_counts())

# # Step 4: Split the Data into Training and Testing Sets
# X = df.drop('species', axis=1)
# y = df['species']
# X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# print("\nTraining Set Size:", X_train.shape)
# print("Testing Set Size:", X_test.shape)

# # Step 5: Train the Model
# model = LogisticRegression(max_iter=200)  # Increase max_iter for convergence
# model.fit(X_train, y_train)

# # Step 6: Make Predictions
# y_pred = model.predict(X_test)
# print("\nPredictions:", y_pred)

# # Step 7: Evaluate the Model
# accuracy = accuracy_score(y_test, y_pred)
# print("\nAccuracy:", accuracy)

# print("\nConfusion Matrix:\n", confusion_matrix(y_test, y_pred))

# print("\nClassification Report:\n", classification_report(y_test, y_pred))

# # Step 8: Visualize the Confusion Matrix
# sns.heatmap(confusion_matrix(y_test, y_pred), annot=True, fmt='d', cmap='Blues')
# plt.xlabel('Predicted')
# plt.ylabel('Actual')
# plt.title('Confusion Matrix')
# plt.show()

# # Step 9: Save the Model
# joblib.dump(model, 'iris_model.pkl')
# print("\nModel saved as 'iris_model.pkl'.")

# Step 10: Load the Model and Make Predictions on New Data
loaded_model = joblib.load('iris_model.pkl')
new_data = [[5.1, 3.5, 1.4, 0.2]]  # Example new data
prediction = loaded_model.predict(new_data)
print("\nPredicted Species for New Data:", iris.target_names[prediction][0])
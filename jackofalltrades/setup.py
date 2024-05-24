from setuptools import setup, find_packages

package_name = "jackofalltrades"
description = """
    Jack of All Trades: A Simple and User-Friendly Machine Learning Toolkit

    Tired of complex machine learning libraries? Introducing jackofalltrades, a streamlined Python package designed to make machine learning accessible for everyone.

    **What sets jackofalltrades apart?**

    - Simplicity: We prioritize clear, concise functions with minimal parameters and intuitive interfaces.
    - Ease of Use: Get started quickly with our well-documented functions and a focus on straightforward implementation.
    - Core Machine Learning Algorithms: Built-in implementations for essential algorithms like linear regression, classification models (coming soon!), and more.
    - Compatibility: Seamlessly work with data formats used by popular libraries like scikit-learn.

    **Ideal for:**

    - Beginners eager to learn machine learning fundamentals.
    - Experienced users seeking a simpler alternative for quick experimentation.
    - Educators looking for a user-friendly teaching tool.

    **Get Started Now!**

    1. Install jackofalltrades using pip: `pip install jackofalltrades`
    2. Import the library and explore its functions:

    ```python
    import jackofalltrades as joft
    from jackofalltrades.datasets import get_data
    # Load data and split into training and testing sets
    ldset = get_dataset()
    X, y = ldset.get_btc()
    # Train a linear regression model
    model = joft.Models.LinearRegression(X, y)
    model.fit()
    # Make predictions and evaluate performance
    y_predicted = model.predict(X)
    model.evaluate(y, y_predicted)
    ```

    Embrace simplicity and unlock the power of machine learning with jackofalltrades!
    """
author = "Sane Punk"
author_email = "punk00pp@gmail.com"
url = "https://github.com/your-username/your_package_name"  # Replace with your project URL
version = "0.1.0"
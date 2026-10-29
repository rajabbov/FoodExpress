<div align="center">

# 🛵 FoodExpress

### *Fast, intuitive, and modern on-demand food delivery Android client*

[![Kotlin](https://img.shields.io/badge/Language-Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Android](https://img.shields.io/badge/Platform-Android_14_--_15-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/)
[![Jetpack Navigation](https://img.shields.io/badge/Architecture-Single_Activity-4285F4?style=for-the-badge&logo=google&logoColor=white)](https://developer.android.com/guide/navigation)

<br/>

| 🍔 Signature Burgers | 🌯 Fresh Lavash / Wraps | 🌭 Street Hotdogs | 🏪 Partner Restaurants |
| :---: | :---: | :---: | :---: |
| <img src="app/src/main/res/drawable/gamburger1.jpg" width="160" style="border-radius:10px;" /> | <img src="app/src/main/res/drawable/lavash.jpg" width="160" style="border-radius:10px;" /> | <img src="app/src/main/res/drawable/hotdog3.jpg" width="160" style="border-radius:10px;" /> | <img src="app/src/main/res/drawable/restaurant.jpg" width="160" style="border-radius:10px;" /> |

</div>

---

## 💡 About The Project

**FoodExpress** is an Android food ordering application crafted in **Kotlin**. Designed to replicate modern food delivery services like DoorDash, Wolt, and Express24, it handles everything from restaurant discovery and promotional campaigns to cart price calculations and checkout payment flows.

### 🔄 User Flow & Order Lifecycle

```text
  [ Splash Screen ]
         │
         ▼
  [ Authentication ] ─── (Sign In / Register)
         │
         ▼
  ┌────────────────────────────────────────────────────────┐
  │                 Main Dashboard (Host)                  │
  │                                                        │
  │  [🏠 Home Feed]    [🗺️ Delivery Map]    [👤 Profile]   │
  │    - Banner Slider   - GPS Location       - Settings   │
  │    - Category Tabs   - Route Tracking                  │
  │    - Dish Catalog                                      │
  └──────────────────────────┬─────────────────────────────┘
                             │
                             ▼
  ┌────────────────────────────────────────────────────────┐
  │               Cart & Checkout Pipeline                 │
  │                                                        │
  │  [🛒 Cart Manager]       ──►  [💳 Checkout Screen]     │
  │    - Dynamic Quantities         - Cash on Delivery     │
  │    - Real-Time Subtotal         - Card Payment         │
  └────────────────────────────────────────────────────────┘
```

---

## ⚡ Core Application Modules

### 1. 🍕 Discovery & Promotional Feed
- **Banner Carousel (`SlideAdapter`):** Auto-scrolling hero banners featuring current deals and daily combos.
- **Categorized Menus (`CategoryTabAdapter`):** Fast horizontal filtering by dish category (Burgers, Pizzas, Drinks, Combos).
- **Restaurant Profiles (`RestaurantAdapter`):** Comprehensive restaurant information cards including delivery times and customer ratings.

### 2. 🛒 Real-Time Cart & Checkout Engine
- **Item Count Modifiers:** Intuitive quantity increments and decrements directly inside the cart items.
- **Dynamic Price Engine:** Live total recalculation as items are adjusted, added, or removed.
- **Dual Payment Options:** Supports both Cash on Delivery and Credit/Debit Card checkout modes.

### 3. 🧭 Navigation & Architecture
- **Single-Activity Architecture:** Centered around `MainActivity` hosting fragments through Android Jetpack's `main_navigation.xml`.
- **Bottom Navigation Integration:** Frictionless switching across Home, Map, Cart, and Profile without reload latency.
- **Type-Safe ViewBinding:** Eliminates `findViewById` bugs and enhances compile-time view safety.

---

## 🛠 Tech Stack Overview

- **Core:** 100% Kotlin (JVM target 1.8)
- **Min / Target SDK:** Android 7.0 (API 24) $\rightarrow$ Android 15 (API 35)
- **UI & Layouts:** XML Layouts, Custom Shape Drawables, Vector Graphics, Material 3 Design
- **Navigation:** Jetpack Navigation Component (Fragment-ktx, UI-ktx `2.7.6`)
- **Data Display:** RecyclerView with specialized Custom Adapters & ViewHolders

---

<details>
<summary><b>📂 Click to expand: Project Directory Hierarchy</b></summary>

```
FoodExpress/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/foodexpress/
│   │   │   ├── adapter/
│   │   │   │   ├── CartProductAdapter.kt    # In-cart item modifiers
│   │   │   │   ├── CategoryAdapter.kt        # Category grid cards
│   │   │   │   ├── CategoryTabAdapter.kt     # Horizontal pill tabs
│   │   │   │   ├── ProductAdapter.kt         # Menu item cards
│   │   │   │   ├── RestaurantAdapter.kt      # Restaurant cards
│   │   │   │   └── SlideAdapter.kt           # Header promotional carousel
│   │   │   ├── model/
│   │   │   │   ├── CategoryModel.kt
│   │   │   │   ├── ProductModel.kt
│   │   │   │   ├── RestaurantModel.kt
│   │   │   │   └── SlideModel.kt
│   │   │   └── screen/
│   │   │       ├── auth/                     # SingActivity & RegistrationActivity
│   │   │       ├── main/
│   │   │       │   ├── cart/                 # CartFragment
│   │   │       │   ├── main/                 # MainFragment
│   │   │       │   ├── map/                  # MapFragment
│   │   │       │   ├── order/checkout/       # CheckoutActivity
│   │   │       │   ├── profile/              # ProfileFragment
│   │   │       │   └── restaurant/           # Detail & Feedback
│   │   │       └── splash/SplashActivity.kt
│   │   └── res/
│   │       ├── drawable/                     # Food imagery, icons & gradient backgrounds
│   │       ├── layout/                       # Screen and component layouts
│   │       └── navigation/main_navigation.xml
│   └── build.gradle
└── settings.gradle
```

</details>

---

## 🚀 Quick Setup & Run

```bash
# 1. Clone repository
git clone https://github.com/ibrohim2005rajabboyev/FoodExpress.git

# 2. Navigate into project
cd FoodExpress

# 3. Open in Android Studio, allow Gradle sync, and run on device/emulator
```

---

## 👨‍💻 Developer

**Ibrohimjon Rajabboyev**  
*Mobile App Developer (Android • Kotlin • Flutter)*  
🔗 [GitHub Profile](https://github.com/ibrohim2005rajabboyev)

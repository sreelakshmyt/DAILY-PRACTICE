

## Problem 1: Task Management System

**Objective:**
Build a Task Management System where users can add tasks, update statuses, remove tasks, and display tasks based on their statuses.

### Task Class:

* **taskName** (String): Name of the task.
* **deadline** (String): Deadline in the format "YYYY-MM-DD".
* **status** (String): Status of the task (e.g., "Not Started", "In Progress", "Completed").

### TaskManager Class:

Manages a list of tasks with the following functionalities:

* **addTask(String taskName, String deadline, String status)**: Adds a task to the list.
* **removeTask(String taskName)**: Removes a task by name.
* **updateStatus(String taskName, String newStatus)**: Updates the status of a task.
* **displayTasksByStatus(String status)**: Displays all tasks with the specified status.

### Requirements:

* Add several tasks with different statuses and deadlines.
* Change the status of a task.
* Display tasks by a specific status.
* Handle non-existent tasks gracefully when trying to remove them.

---

## Problem 2: Inventory Management System

**Objective:**
Create an Inventory Management System to track products in a store, with the ability to add, delete, modify, and check the availability of items.

### InventoryItem Class:

* **itemname** (String): Name of the item.
* **quantity** (int): Quantity of the item.

### Inventory Class:

Manages inventory items with the following functionalities:

* **addItem(String itemName, int quantity)**: Adds a new item to the inventory.
* **deleteItem(String itemName)**: Removes an item by name.
* **modifyQuantity(String itemName, int quantity)**: Modifies the quantity of an item.
* **Displayall()**: Displays all items in the inventory.
* **isItemAvailable(String itemName)**: Checks if an item is in the inventory.

### Requirements:

* Add, modify, and remove items in the inventory.
* Display all items and check if a specific item exists.

---

## Problem 3: Shopping List Application

**Objective:**
Create a simple shopping list app that allows users to add items, remove items, check if an item exists in the list, and display the final shopping list.

### Functionalities:

* **Add items**: Users can add items to the list (at least 5 items).
* **Remove items**: Remove items by name.
* **Check for items**: Check if a specific item is in the list.
* **Display the shopping list**: Show the full shopping list after each operation.

### Requirements:

* Add items to the shopping list.
* Remove items from the list.
* Check if an item is in the list.
* Display the updated list after each operation.


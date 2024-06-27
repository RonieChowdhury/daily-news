//
//  AboutScreen.swift
//  iosApp
//
//  Created by Sourangshu Chowdhury.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct AboutScreen: View {
    @Environment(\.dismiss)
    private var dismiss
    
    var body: some View {
        NavigationStack {
            AboutListView()
                .navigationTitle("About Device")
        }
    }
}

#Preview {
    AboutScreen()
}

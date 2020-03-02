import {NgModule} from '@angular/core'
import{MatGridListModule, MatGridList} from '@angular/material/grid-list'
import{MatPaginatorModule} from '@angular/material/paginator'
import {MatCardModule} from '@angular/material/card'
@NgModule({
    imports:[
        MatGridListModule,
        MatPaginatorModule,
        MatCardModule
    ],
    exports:[
        MatGridListModule,
        MatPaginatorModule,
        MatCardModule
    ]
})


export class MaterialModule{}
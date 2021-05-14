import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-info-page',
  templateUrl: './info-page.component.html',
  styleUrls: ['./info-page.component.css']
})
export class InfoPageComponent implements OnInit {

  public type: any | undefined;

  constructor(private activatedroute:ActivatedRoute) { }

  ngOnInit(): void {
    this.type = this.activatedroute.snapshot.paramMap.get("month");
  }

}

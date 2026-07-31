package androidx.car.app.model;

import defpackage.InterfaceC11652l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class billing implements InterfaceC11652l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f296l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ SearchCallbackDelegateImpl.SearchCallbackStub f297l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f298l;

    public /* synthetic */ billing(SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub, String str, int i) {
        this.f298l = i;
        this.f297l = searchCallbackStub;
        this.f296l = str;
    }

    @Override // defpackage.InterfaceC11652l
    public final Object yandex() {
        int i = this.f298l;
        String str = this.f296l;
        SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub = this.f297l;
        switch (i) {
            case 0:
                return searchCallbackStub.lambda$onSearchSubmitted$1(str);
            default:
                return searchCallbackStub.lambda$onSearchTextChanged$0(str);
        }
    }
}

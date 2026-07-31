package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lۦؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18696l implements InterfaceC16975l, InterfaceC3266l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f36463l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36464l;

    public /* synthetic */ C18696l(int i, C13708l c13708l) {
        this.f36464l = i;
        this.f36463l = c13708l;
    }

    @Override // defpackage.InterfaceC3266l
    public Object admob(C3726l c3726l, C6499l c6499l, int i) {
        int i2 = this.f36464l;
        List list = this.f36463l;
        switch (i2) {
            case 1:
                break;
        }
        return c3726l.ads(c6499l, list);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        ((InterfaceC13521l) obj).mo2735extends(this.f36463l);
    }
}

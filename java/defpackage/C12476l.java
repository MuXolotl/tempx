package defpackage;

import android.os.Handler;

/* JADX INFO: renamed from: lٌّٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12476l implements InterfaceC16975l, InterfaceC18679l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ long f24613l;

    public /* synthetic */ C12476l(long j) {
        this.f24613l = j;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        ((C18602l) obj).mo2759for(this.f24613l);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        C7026l c7026l;
        C9482l c9482l = (C9482l) obj;
        C7653l c7653l = c9482l.loadAd;
        if (c9482l == c7653l.firebase && (c7026l = c7653l.metrica) != null) {
            C4886l c4886l = (C4886l) c7026l.f14720l;
            c4886l.f9959l = true;
            C18595l c18595l = c4886l.f9973l;
            Handler handler = (Handler) c18595l.f36317l;
            if (handler != null) {
                handler.post(new RunnableC13086l(c18595l, this.f24613l, 0));
            }
        }
    }
}

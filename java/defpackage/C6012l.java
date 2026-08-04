package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lؘ۠ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6012l implements InterfaceC17619l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Context f12764l;

    public /* synthetic */ C6012l(Context context) {
        this.f12764l = context;
    }

    @Override // defpackage.InterfaceC17619l
    public InterfaceC11449l yandex(C4619l c4619l) {
        String str = (String) c4619l.f9372l;
        C14785l c14785l = (C14785l) c4619l.f9374l;
        if (str != null && str.length() != 0) {
            return new C1611l(this.f12764l, str, c14785l, true, true);
        }
        C8339l.metrica("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }
}

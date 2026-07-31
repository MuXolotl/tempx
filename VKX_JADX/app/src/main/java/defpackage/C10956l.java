package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: renamed from: lَُٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10956l implements InterfaceC3266l, InterfaceC18679l, InterfaceC12202l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f22086l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f22087l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22088l;

    public /* synthetic */ C10956l(Object obj, boolean z, int i) {
        this.f22088l = i;
        this.f22086l = obj;
        this.f22087l = z;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        ((C18602l) obj).mo2748break((C13736l) this.f22086l, this.f22087l);
    }

    @Override // defpackage.InterfaceC3266l
    public Object admob(C3726l c3726l, C6499l c6499l, int i) {
        int i2 = this.f22088l;
        boolean z = this.f22087l;
        Object obj = this.f22086l;
        switch (i2) {
            case 0:
                return c3726l.appmetrica(c6499l, AbstractC1186l.isVip((C2427l) obj), z ? -1 : c3726l.tapsense.mo2761implements(), z ? -9223372036854775807L : c3726l.tapsense.mo2771l());
            default:
                return c3726l.appmetrica(c6499l, (List) obj, z ? -1 : c3726l.tapsense.mo2761implements(), z ? -9223372036854775807L : c3726l.tapsense.mo2771l());
        }
    }

    @Override // defpackage.InterfaceC12202l
    public void amazon(Object obj) {
        SharedPreferences.Editor editorEdit = AbstractC0555l.mopub((Context) this.f22086l).edit();
        editorEdit.putBoolean("proxy_retention", this.f22087l);
        editorEdit.apply();
    }
}

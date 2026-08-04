package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٟؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2004l extends AbstractC7581l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C14750l f4525l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f4526l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C2671l f4527l;

    public /* synthetic */ C2004l(C14750l c14750l, C2671l c2671l, int i) {
        this.f4526l = i;
        this.f4525l = c14750l;
        this.f4527l = c2671l;
    }

    @Override // defpackage.AbstractC7581l
    public final void isPro(Throwable th) {
        int i = this.f4526l;
        C14750l c14750l = this.f4525l;
        C2671l c2671l = this.f4527l;
        switch (i) {
            case 0:
                c14750l.getClass();
                Object objYandex = C14750l.f28822l.get(c14750l);
                if (!(objYandex instanceof C2175l)) {
                    objYandex = AbstractC7114l.yandex(objYandex);
                }
                c2671l.subs(c14750l, objYandex);
                break;
            default:
                c2671l.subs(c14750l, Unit.INSTANCE);
                break;
        }
    }

    @Override // defpackage.AbstractC7581l
    public final boolean subs() {
        switch (this.f4526l) {
        }
        return false;
    }
}

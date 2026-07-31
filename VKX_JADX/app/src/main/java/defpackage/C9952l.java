package defpackage;

/* JADX INFO: renamed from: lٍۦٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9952l extends AbstractC16817l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ String f20309l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f20310l;

    public /* synthetic */ C9952l(String str, int i) {
        this.f20310l = i;
        this.f20309l = str;
    }

    @Override // defpackage.InterfaceC6795l
    public final void yandex(Object obj) {
        int i = this.f20310l;
        String str = this.f20309l;
        switch (i) {
            case 0:
                ((AbstractC12216l) obj).crashlytics(str, new C15053l(C11963l.appmetrica(13)));
                break;
            case 1:
                ((AbstractC12216l) obj).amazon(str);
                break;
            default:
                AbstractC3984l.ad(((C1817l) obj).yandex.f14762l, new C6908l(str, 5));
                break;
        }
    }
}

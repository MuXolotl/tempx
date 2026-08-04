package defpackage;

/* JADX INFO: renamed from: lُۣٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11435l extends AbstractC4892l {
    public final /* synthetic */ AbstractC4892l amazon;
    public final /* synthetic */ AbstractC4892l crashlytics;

    public C11435l(AbstractC4892l abstractC4892l, AbstractC4892l abstractC4892l2) {
        this.crashlytics = abstractC4892l;
        this.amazon = abstractC4892l2;
    }

    @Override // defpackage.AbstractC4892l
    public final void yandex() {
        AbstractC4892l abstractC4892l = this.amazon;
        try {
            this.crashlytics.yandex();
        } finally {
            abstractC4892l.yandex();
        }
    }
}

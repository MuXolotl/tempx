package defpackage;

/* JADX INFO: renamed from: lِٓۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14367l extends AbstractC5646l {
    @Override // defpackage.AbstractC5646l
    public final float smaato(C15728l c15728l) {
        return c15728l.f30898l.loadAd * 10000.0f;
    }

    @Override // defpackage.AbstractC5646l
    public final void startapp(C15728l c15728l, float f) {
        c15728l.f30898l.loadAd = f / 10000.0f;
        c15728l.invalidateSelf();
    }
}

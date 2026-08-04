package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: lٕ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18150l extends AbstractC7877l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f35531l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ CarouselLayoutManager f35532l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18150l(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 1);
        this.f35531l = i;
        switch (i) {
            case 1:
                this.f35532l = carouselLayoutManager;
                super(0, 1);
                break;
            default:
                this.f35532l = carouselLayoutManager;
                break;
        }
    }

    @Override // defpackage.AbstractC7877l
    public final int admob() {
        switch (this.f35531l) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f35532l;
                if (carouselLayoutManager.m185l()) {
                    return carouselLayoutManager.vip;
                }
                return 0;
        }
    }

    @Override // defpackage.AbstractC7877l
    public final int amazon() {
        int i = this.f35531l;
        CarouselLayoutManager carouselLayoutManager = this.f35532l;
        switch (i) {
            case 0:
                return carouselLayoutManager.metrica;
            default:
                return carouselLayoutManager.metrica - carouselLayoutManager.m143package();
        }
    }

    @Override // defpackage.AbstractC7877l
    public final int billing() {
        switch (this.f35531l) {
            case 0:
                return this.f35532l.m146synchronized();
            default:
                return 0;
        }
    }

    @Override // defpackage.AbstractC7877l
    public final int mopub() {
        int i = this.f35531l;
        CarouselLayoutManager carouselLayoutManager = this.f35532l;
        switch (i) {
            case 0:
                return carouselLayoutManager.vip - carouselLayoutManager.m145strictfp();
            default:
                return carouselLayoutManager.vip;
        }
    }

    @Override // defpackage.AbstractC7877l
    public final int subs() {
        switch (this.f35531l) {
            case 0:
                return 0;
            default:
                return this.f35532l.m148volatile();
        }
    }
}

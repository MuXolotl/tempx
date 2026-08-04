package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* JADX INFO: renamed from: lؕٙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3463l implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ InterfaceC3773l crashlytics;
    public final /* synthetic */ C9122l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C3463l(InterfaceC3773l interfaceC3773l, C9122l c9122l, int i) {
        this.yandex = i;
        this.crashlytics = interfaceC3773l;
        this.loadAd = c9122l;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        int i = this.yandex;
        C9122l c9122l = this.loadAd;
        InterfaceC3773l interfaceC3773l = this.crashlytics;
        switch (i) {
            case 0:
                Size size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                C15106l c15106l = ((C5483l) interfaceC3773l).loadAd;
                C9192l c9192l = c15106l.loadAd;
                int i2 = c15106l.crashlytics;
                C16543l c16543l = AbstractC12872l.loadAd;
                long jCrashlytics = AbstractC3105l.crashlytics(width, height, c9192l, i2, (C9192l) AbstractC0532l.amazon(c15106l, c16543l));
                int i3 = (int) (jCrashlytics >> 32);
                int i4 = (int) (jCrashlytics & 4294967295L);
                if (width > 0 && height > 0 && (width != i3 || height != i4)) {
                    C15106l c15106l2 = ((C5483l) interfaceC3773l).loadAd;
                    double dAmazon = AbstractC3105l.amazon(width, height, i3, i4, c15106l2.crashlytics, (C9192l) AbstractC0532l.amazon(c15106l2, c16543l));
                    boolean z = dAmazon < 1.0d;
                    c9122l.f18750l = z;
                    if (z || ((C5483l) interfaceC3773l).loadAd.amazon == 1) {
                        imageDecoder.setTargetSize(AbstractC5573l.adcel(((double) width) * dAmazon), AbstractC5573l.adcel(dAmazon * ((double) height)));
                    }
                }
                C15106l c15106l3 = ((C5483l) interfaceC3773l).loadAd;
                imageDecoder.setAllocator(AbstractC5941l.m1911throws(AbstractC10413l.loadAd(c15106l3)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) AbstractC0532l.amazon(c15106l3, AbstractC10413l.mopub)).booleanValue() ? 1 : 0);
                C16543l c16543l2 = AbstractC10413l.crashlytics;
                if (C1759l.billing(AbstractC0532l.amazon(c15106l3, c16543l2)) != null) {
                    imageDecoder.setTargetColorSpace(C1759l.billing(AbstractC0532l.amazon(c15106l3, c16543l2)));
                }
                if (AbstractC0532l.amazon(c15106l3, AbstractC11114l.loadAd) != null) {
                    C18725l.loadAd();
                } else {
                    imageDecoder.setPostProcessor(null);
                }
                break;
            default:
                Size size2 = imageInfo.getSize();
                int width2 = size2.getWidth();
                int height2 = size2.getHeight();
                C15106l c15106l4 = ((C9882l) interfaceC3773l).crashlytics;
                C9192l c9192l2 = c15106l4.loadAd;
                int i5 = c15106l4.crashlytics;
                C16543l c16543l3 = AbstractC12872l.loadAd;
                long jCrashlytics2 = AbstractC3105l.crashlytics(width2, height2, c9192l2, i5, (C9192l) AbstractC0532l.amazon(c15106l4, c16543l3));
                int i6 = (int) (jCrashlytics2 >> 32);
                int i7 = (int) (jCrashlytics2 & 4294967295L);
                if (width2 > 0 && height2 > 0 && (width2 != i6 || height2 != i7)) {
                    C15106l c15106l5 = ((C9882l) interfaceC3773l).crashlytics;
                    double dAmazon2 = AbstractC3105l.amazon(width2, height2, i6, i7, c15106l5.crashlytics, (C9192l) AbstractC0532l.amazon(c15106l5, c16543l3));
                    boolean z2 = dAmazon2 < 1.0d;
                    c9122l.f18750l = z2;
                    if (z2 || ((C9882l) interfaceC3773l).crashlytics.amazon == 1) {
                        imageDecoder.setTargetSize(AbstractC5573l.adcel(((double) width2) * dAmazon2), AbstractC5573l.adcel(dAmazon2 * ((double) height2)));
                    }
                }
                imageDecoder.setOnPartialImageListener(new C1748l());
                C15106l c15106l6 = ((C9882l) interfaceC3773l).crashlytics;
                imageDecoder.setAllocator(AbstractC5941l.m1911throws(AbstractC10413l.loadAd(c15106l6)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) AbstractC0532l.amazon(c15106l6, AbstractC10413l.mopub)).booleanValue() ? 1 : 0);
                C16543l c16543l4 = AbstractC10413l.crashlytics;
                if (C1759l.billing(AbstractC0532l.amazon(c15106l6, c16543l4)) != null) {
                    imageDecoder.setTargetColorSpace(C1759l.billing(AbstractC0532l.amazon(c15106l6, c16543l4)));
                }
                imageDecoder.setUnpremultipliedRequired(!((Boolean) AbstractC0532l.amazon(c15106l6, AbstractC10413l.amazon)).booleanValue());
                break;
        }
    }
}

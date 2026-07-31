package defpackage;

import android.media.ImageWriter;

/* JADX INFO: renamed from: lِِٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11878l implements InterfaceC5899l, AutoCloseable, ImageWriter.OnImageReleasedListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C11561l f23698l = AbstractC1805l.crashlytics(null);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f23699l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ImageWriter f23700l;

    public C11878l(ImageWriter imageWriter, int i) {
        this.f23700l = imageWriter;
        this.f23699l = i;
        imageWriter.getMaxImages();
        imageWriter.getFormat();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f23700l.close();
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        if (this.f23698l.yandex == null) {
            return;
        }
        C18725l.loadAd();
    }

    public final String toString() {
        return "ImageWriter-" + C10134l.yandex(this.f23700l.getFormat()) + '-' + ((Object) ("Input-" + this.f23699l));
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        if (interfaceC1388l.equals(AbstractC18202l.yandex.loadAd(ImageWriter.class))) {
            return this.f23700l;
        }
        return null;
    }
}

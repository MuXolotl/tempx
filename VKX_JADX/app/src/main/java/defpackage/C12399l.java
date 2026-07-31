package defpackage;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

/* JADX INFO: renamed from: lُّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12399l extends AbstractC5859l {
    public final Object loadAd() {
        return ImageIO.read(ImageIO.createImageInputStream(new ByteArrayInputStream(this.yandex)));
    }

    @Override // defpackage.AbstractC5859l
    public final boolean yandex() {
        try {
            BufferedImage bufferedImage = (BufferedImage) loadAd();
            this.amazon = bufferedImage.getWidth();
            this.purchase = bufferedImage.getHeight();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}

package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٌَٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10407l implements InterfaceC14142l {
    public final C15106l loadAd;
    public final C16820l yandex;

    public C10407l(C16820l c16820l, C15106l c15106l) {
        this.yandex = c16820l;
        this.loadAd = c15106l;
    }

    @Override // defpackage.InterfaceC14142l
    public final Object yandex(C6563l c6563l) throws FileNotFoundException {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        ContentResolver contentResolver = vKXApplication.getContentResolver();
        C16820l c16820l = this.yandex;
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(Uri.parse(c16820l.getAmazon()));
        if (inputStreamOpenInputStream == null) {
            C11983l.advert(String.valueOf(c16820l.yandex), "[sdkload] failed resolving cover for ");
            return null;
        }
        C7035l c7035lLoadAd = AbstractC17291l.loadAd(new C1503l(AbstractC7709l.purchase(inputStreamOpenInputStream)), this.loadAd.billing);
        VKXApplication vKXApplication2 = VKXApplication.f36631l;
        return new C6669l(c7035lLoadAd, (vKXApplication2 != null ? vKXApplication2 : null).getContentResolver().getType(Uri.parse(c16820l.getAmazon())), 3);
    }
}

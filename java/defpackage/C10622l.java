package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: renamed from: lَۣ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10622l implements InterfaceC14142l {
    public final C15106l loadAd;
    public final C16060l yandex;

    public C10622l(C16060l c16060l, C15106l c15106l) {
        this.yandex = c16060l;
        this.loadAd = c15106l;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    @Override // defpackage.InterfaceC14142l
    public final Object yandex(C6563l c6563l) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listMetrica;
        int size;
        Bundle bundle;
        C16060l c16060l = this.yandex;
        Uri uri = Uri.parse(c16060l.yandex);
        C15106l c15106l = this.loadAd;
        ContentResolver contentResolver = c15106l.yandex.getContentResolver();
        String str = c16060l.amazon;
        if (AbstractC8576l.yandex(str, "com.android.contacts") && AbstractC8576l.yandex(AbstractC16901l.m4212class(AbstractC1051l.metrica(c16060l)), "display_photo")) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                C8936l.firebase(uri, "'.", "Unable to find a contact photo associated with '");
                return null;
            }
        } else if (Build.VERSION.SDK_INT >= 29 && AbstractC8576l.yandex(str, "media") && (size = (listMetrica = AbstractC1051l.metrica(c16060l)).size()) >= 3 && AbstractC8576l.yandex(listMetrica.get(size - 3), "audio") && AbstractC8576l.yandex(listMetrica.get(size - 2), "albums")) {
            C9192l c9192l = c15106l.loadAd;
            InterfaceC18382l interfaceC18382l = c9192l.yandex;
            C12881l c12881l = interfaceC18382l instanceof C12881l ? (C12881l) interfaceC18382l : null;
            if (c12881l != null) {
                int i = c12881l.yandex;
                InterfaceC18382l interfaceC18382l2 = c9192l.loadAd;
                C12881l c12881l2 = interfaceC18382l2 instanceof C12881l ? (C12881l) interfaceC18382l2 : null;
                if (c12881l2 != null) {
                    int i2 = c12881l2.yandex;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                } else {
                    bundle = null;
                }
            } else {
                bundle = null;
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                C8936l.firebase(uri, "'.", "Unable to find a music thumbnail associated with '");
                return null;
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                C8936l.firebase(uri, "'.", "Unable to open '");
                return null;
            }
        }
        return new C6669l(new C7035l(new C1503l(AbstractC7709l.purchase(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), c15106l.billing, new C5148l(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), 3);
    }
}

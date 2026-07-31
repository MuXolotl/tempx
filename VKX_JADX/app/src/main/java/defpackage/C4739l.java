package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;

/* JADX INFO: renamed from: lؚؗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4739l extends C17423l {
    @Override // defpackage.C17423l
    /* JADX INFO: renamed from: crashlytics, reason: merged with bridge method [inline-methods] */
    public final Intent amazon(Context context, Uri uri) {
        StorageManager storageManager;
        StorageVolume primaryStorageVolume;
        Intent intentCreateOpenDocumentTreeIntent;
        if (Build.VERSION.SDK_INT >= 29 && (storageManager = (StorageManager) context.getSystemService(StorageManager.class)) != null && (primaryStorageVolume = storageManager.getPrimaryStorageVolume()) != null && (intentCreateOpenDocumentTreeIntent = primaryStorageVolume.createOpenDocumentTreeIntent()) != null) {
            return intentCreateOpenDocumentTreeIntent;
        }
        Intent intentAmazon = super.amazon(context, uri);
        intentAmazon.putExtra("android.content.extra.SHOW_ADVANCED", true);
        intentAmazon.putExtra("android.content.extra.FANCY", true);
        return intentAmazon;
    }
}

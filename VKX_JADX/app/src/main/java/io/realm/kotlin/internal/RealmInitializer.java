package io.realm.kotlin.internal;

import android.content.Context;
import defpackage.InterfaceC13497l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/realm/kotlin/internal/RealmInitializer;", "Llْٛٗ;", "Landroid/content/Context;", "<init>", "()V", "cinterop_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RealmInitializer implements InterfaceC13497l {
    public static File yandex;

    @Override // defpackage.InterfaceC13497l
    public final List loadAd() {
        return new ArrayList();
    }

    @Override // defpackage.InterfaceC13497l
    public final Object yandex(Context context) {
        yandex = context.getFilesDir();
        context.getAssets();
        try {
            System.loadLibrary("realmc");
            return context;
        } catch (Throwable th) {
            System.out.println((Object) ("Failed to load realmc library: " + th));
            throw th;
        }
    }
}

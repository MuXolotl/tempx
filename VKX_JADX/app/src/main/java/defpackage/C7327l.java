package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؚؚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7327l extends ClassLoader {
    public final /* synthetic */ int yandex = 1;

    public C7327l() {
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) {
        switch (this.yandex) {
            case 1:
                if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
                    return super.loadClass(str, z);
                }
                if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
                    Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                }
                return C1882l.class;
            default:
                return super.loadClass(str, z);
        }
    }

    public ArrayList yandex() {
        Package[] packages = getPackages();
        ArrayList arrayList = new ArrayList(packages.length);
        for (Package r0 : packages) {
            arrayList.add(r0.getName());
        }
        return arrayList;
    }

    public C7327l(ClassLoader classLoader) {
        super(classLoader);
    }
}

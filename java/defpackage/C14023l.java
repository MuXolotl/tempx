package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lًٓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14023l {
    public static final String crashlytics;
    public static final C14023l loadAd = new C14023l(new HashSet());
    public final AbstractC8481l yandex;

    static {
        String str = AbstractC15323l.yandex;
        crashlytics = Integer.toString(0, 36);
    }

    public C14023l(HashSet hashSet) {
        this.yandex = AbstractC8481l.ads(hashSet);
    }

    public static C14023l loadAd(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(crashlytics);
        if (parcelableArrayList == null) {
            AbstractC6427l.vip("SessionCommands", "Missing commands. Creating an empty SessionCommands");
            return loadAd;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(C12417l.yandex((Bundle) parcelableArrayList.get(i)));
        }
        return new C14023l(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14023l) {
            return this.yandex.equals(((C14023l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.yandex);
    }

    public final boolean yandex(int i) {
        AbstractC12442l.subs(i != 0, "Use contains(Command) for custom command");
        Iterator<E> it = this.yandex.iterator();
        while (it.hasNext()) {
            if (((C12417l) it.next()).yandex == i) {
                return true;
            }
        }
        return false;
    }
}

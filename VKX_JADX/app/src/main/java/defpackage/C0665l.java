package defpackage;

import android.util.Range;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؙۣؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0665l {
    public static final C6916l billing;
    public final List amazon;
    public final int crashlytics;
    public final C7420l loadAd;
    public final C12920l purchase;
    public final ArrayList yandex;

    static {
        new C6916l("camerax.core.captureConfig.rotation", Integer.TYPE, null);
        new C6916l("camerax.core.captureConfig.jpegQuality", Integer.class, null);
        billing = new C6916l("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    }

    public C0665l(ArrayList arrayList, C7420l c7420l, int i, ArrayList arrayList2, C12920l c12920l) {
        this.yandex = arrayList;
        this.loadAd = c7420l;
        this.crashlytics = i;
        this.amazon = DesugarCollections.unmodifiableList(arrayList2);
        this.purchase = c12920l;
    }

    public final Range yandex() {
        Range range = (Range) this.loadAd.smaato(billing, C5464l.admob);
        Objects.requireNonNull(range);
        return range;
    }
}

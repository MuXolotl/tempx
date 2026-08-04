package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lۣؗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5249l extends AbstractC1680l {
    public final Function1 amazon;
    public final int crashlytics;
    public final String loadAd;

    public C5249l(Object obj, String str, int i, Function1 function1) {
        super(obj);
        this.loadAd = str;
        this.crashlytics = i;
        this.amazon = function1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.yandex);
        sb.append(", label=\"");
        sb.append(this.loadAd);
        sb.append("\", leadingIcon=");
        return AbstractC14814l.remoteconfig(this.crashlytics, ")", sb);
    }
}

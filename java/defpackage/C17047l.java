package defpackage;

import j$.util.DesugarCollections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: renamed from: lُُٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17047l extends AbstractC15029l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Map f33206l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final EnumC4433l f33207l;

    static {
        EnumMap enumMap = new EnumMap(EnumC4433l.class);
        for (EnumC4433l enumC4433l : EnumC4433l.values()) {
            C17047l[] c17047lArr = new C17047l[10];
            for (int i = 0; i < 10; i++) {
                c17047lArr[i] = new C17047l(i, enumC4433l, C17465l.purchase);
            }
            enumMap.put(enumC4433l, c17047lArr);
        }
        f33206l = DesugarCollections.unmodifiableMap(enumMap);
    }

    public C17047l(int i, EnumC4433l enumC4433l, C17465l c17465l) {
        super(c17465l, i);
        AbstractC13841l.billing(enumC4433l, "format char");
        this.f33207l = enumC4433l;
        if (c17465l.yandex()) {
            return;
        }
        int i2 = enumC4433l.f9028l;
        i2 = c17465l.crashlytics() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        c17465l.amazon(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.AbstractC15029l
    /* JADX INFO: renamed from: private */
    public final void mo1994private(C2934l c2934l, Object obj) {
        c2934l.subs(obj, this.f33207l, (C17465l) this.f29554l);
    }
}

package defpackage;

import java.io.EOFException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: renamed from: lْٜؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2594l extends AbstractC7188l {
    public final C0458l amazon;
    public final Enum[] crashlytics;
    public final String[] loadAd;
    public final Class yandex;

    public C2594l(Class cls) {
        this.yandex = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.crashlytics = enumArr;
            this.loadAd = new String[enumArr.length];
            int i = 0;
            while (true) {
                Enum[] enumArr2 = this.crashlytics;
                if (i >= enumArr2.length) {
                    this.amazon = C0458l.m547strictfp(this.loadAd);
                    return;
                }
                String strName = enumArr2[i].name();
                String[] strArr = this.loadAd;
                Field field = cls.getField(strName);
                Set set = AbstractC7694l.yandex;
                InterfaceC9347l interfaceC9347l = (InterfaceC9347l) field.getAnnotation(InterfaceC9347l.class);
                if (interfaceC9347l != null) {
                    String strName2 = interfaceC9347l.name();
                    if (!"\u0000".equals(strName2)) {
                        strName = strName2;
                    }
                }
                strArr[i] = strName;
                i++;
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        c3631l.m1367throw(this.loadAd[((Enum) obj).ordinal()]);
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        int iM496l = c0396l.m496l(this.amazon);
        if (iM496l != -1) {
            return this.crashlytics[iM496l];
        }
        String strInmobi = c0396l.inmobi();
        String strM494import = c0396l.m494import();
        throw new C6451l("Expected one of " + Arrays.asList(this.loadAd) + " but was " + strM494import + " at path " + strInmobi, 8, (byte) 0);
    }

    public final String toString() {
        return "JsonAdapter(" + this.yandex.getName() + ")";
    }
}

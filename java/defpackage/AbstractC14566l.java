package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘٓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14566l {
    public static boolean loadAd = false;
    public static final long[] yandex = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    public static final C15578l amazon(int i, InterfaceC14328l interfaceC14328l, C6956l c6956l) {
        Object objM2132native = c6956l.m2132native();
        if (objM2132native == C1867l.yandex) {
            objM2132native = new C15578l(i, true, interfaceC14328l);
            c6956l.m2147try(objM2132native);
        }
        C15578l c15578l = (C15578l) objM2132native;
        if (!c15578l.f30420l.equals(interfaceC14328l)) {
            c15578l.f30420l = interfaceC14328l;
            if (c15578l.f30421l) {
                C4224l c4224l = c15578l.f30424l;
                if (c4224l != null) {
                    C6931l c6931l = c4224l.yandex;
                    if (c6931l != null) {
                        c6931l.subscription(c4224l, null);
                    }
                    c15578l.f30424l = null;
                }
                ArrayList arrayList = c15578l.f30423l;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C4224l c4224l2 = (C4224l) arrayList.get(i2);
                        C6931l c6931l2 = c4224l2.yandex;
                        if (c6931l2 != null) {
                            c6931l2.subscription(c4224l2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return c15578l;
    }

    public static final InterfaceC17242l billing(InterfaceC17242l interfaceC17242l, float f) {
        return f == 0.0f ? interfaceC17242l : AbstractC7477l.crashlytics(interfaceC17242l, 0.0f, 0.0f, 0.0f, 0.0f, f, null, false, 1048319);
    }

    public static AbstractC8238l crashlytics(Metadata metadata) {
        String string;
        if (metadata.mv().length == 0) {
            C8339l.metrica("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
            return null;
        }
        C4995l c4995l = new C4995l(metadata.mv(), (metadata.xi() & 8) != 0);
        boolean zYandex = c4995l.yandex(1, 1, 0);
        if (!zYandex) {
            if (zYandex) {
                StringBuilder sb = new StringBuilder("while maximum supported version is ");
                sb.append(c4995l.billing ? C4995l.mopub : C4995l.admob);
                sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
                string = sb.toString();
            } else {
                string = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
            }
            C1759l.smaato("Provided Metadata instance has version ", c4995l, ", ", string);
            return null;
        }
        try {
            int iK = metadata.k();
            if (iK == 1) {
                return new C9260l(metadata);
            }
            if (iK == 2) {
                return new C2408l(metadata);
            }
            if (iK == 3) {
                return new C11808l(metadata);
            }
            if (iK != 4) {
                if (iK == 5) {
                    return new C18370l(metadata);
                }
                C11808l c11808l = new C11808l();
                new C2787l(metadata.mv());
                metadata.xi();
                return c11808l;
            }
            List listAsList = Arrays.asList(metadata.d1());
            new C2787l(metadata.mv());
            metadata.xi();
            C2395l c2395l = new C2395l();
            c2395l.yandex = listAsList;
            return c2395l;
        } catch (Throwable th) {
            if ((th instanceof IllegalArgumentException) || (th instanceof VirtualMachineError) || (th instanceof ThreadDeath)) {
                throw th;
            }
            throw new C14612l("Exception occurred when reading Kotlin metadata", th);
        }
    }

    public static float loadAd(int i) {
        Set set = C3963l.f8145l;
        if (i == 2) {
            return 840.0f;
        }
        return i == 1 ? 600.0f : 0.0f;
    }

    public static final boolean purchase(C4224l c4224l, C4224l c4224l2) {
        if (c4224l == null) {
            return true;
        }
        if (c4224l instanceof C4224l) {
            return !c4224l.yandex() || c4224l == c4224l2 || AbstractC8576l.yandex(c4224l.crashlytics, c4224l2.crashlytics);
        }
        return false;
    }

    public static final int yandex(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }
}

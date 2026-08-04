package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؖٓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4107l {
    public static final void amazon(Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            C14513l.tapsense().vip(AbstractC4393l.yandex, "Migrating WorkDatabase to the no-backup directory");
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            String[] strArr = AbstractC4393l.loadAd;
            int iFirebase = AbstractC2200l.firebase(strArr.length);
            if (iFirebase < 16) {
                iFirebase = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            for (Map.Entry entry : AbstractC8676l.startapp(linkedHashMap, new C8195l(databasePath, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        C14513l.tapsense().appmetrica(AbstractC4393l.yandex, "Over-writing contents of " + file2);
                    }
                    C14513l.tapsense().vip(AbstractC4393l.yandex, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public static int[] crashlytics(int i, int i2) {
        int i3;
        int i4 = (i + 127) >> 7;
        if (i2 == 261888) {
            i3 = (((i4 * 1025) + 2097152) >> 22) & 15;
        } else {
            if (i2 != 95232) {
                C18073l.license("Wrong Gamma2!");
                return null;
            }
            int i5 = ((i4 * 11275) + 8388608) >> 24;
            i3 = i5 ^ (((43 - i5) >> 31) & i5);
        }
        int i6 = i - ((i3 * 2) * i2);
        return new int[]{i6 - (((4190208 - i6) >> 31) & 8380417), i3};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C10227l loadAd(AbstractC6242l abstractC6242l, List list, C4258l c4258l, List list2, C12843l c12843l, boolean z) {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        if (z) {
            InterfaceC9191l interfaceC9191lAd = abstractC6242l.ad();
            if (interfaceC9191lAd instanceof C5160l) {
                if (AbstractC7572l.subs(abstractC6242l)) {
                    if (((C5160l) interfaceC9191lAd).subscription()) {
                        c10227lAdmob.add(new C10531l(abstractC6242l, AbstractC18202l.yandex.loadAd(((InterfaceC13937l) ((InterfaceC1388l) interfaceC9191lAd)).mo1730private().getDeclaringClass())));
                    }
                } else if (!(abstractC6242l instanceof AbstractC12055l) || !AbstractC0601l.f2039l.amazon(((InterfaceC2957l) abstractC6242l).loadAd())) {
                    C8936l.smaato(abstractC6242l, "Only top-level callables are supported for now: ");
                    return null;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c10227lAdmob.add(new C7474l(abstractC6242l, (C13565l) it.next(), c10227lAdmob.pro(), 2, c12843l));
            }
            if (c4258l != null) {
                C13565l c13565l = new C13565l(0, AbstractC13589l.amazon.loadAd());
                c13565l.crashlytics = c4258l;
                c10227lAdmob.add(new C7474l(abstractC6242l, c13565l, c10227lAdmob.pro(), 3, c12843l));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c10227lAdmob.add(new C7474l(abstractC6242l, (C13565l) it2.next(), c10227lAdmob.pro(), 4, c12843l));
        }
        return AbstractC14055l.purchase(c10227lAdmob);
    }

    public static final InterfaceC17242l purchase(InterfaceC17242l interfaceC17242l, Function1 function1) {
        return interfaceC17242l.premium(new C13867l(function1));
    }

    public static final void yandex(AbstractC18082l abstractC18082l, InterfaceC17242l interfaceC17242l, C15578l c15578l, C6956l c6956l, int i, int i2) {
        C15578l c15578l2;
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(707388573);
        int i3 = 2;
        int i4 = i | ((i & 8) == 0 ? c6956l.billing(abstractC18082l) : c6956l.admob(abstractC18082l) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        boolean z = false;
        if (c6956l.m2127for(i4 & 1, (i4 & 147) != 146)) {
            InterfaceC17242l interfaceC17242l3 = i5 != 0 ? C4346l.f8873l : interfaceC17242l;
            C17253l c17253lLoadAd = AbstractC3605l.loadAd(16.0f, 0.0f, 2);
            int i6 = i4;
            C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
            if ((i6 & 14) == 4 || ((i6 & 8) != 0 && c6956l.admob(abstractC18082l))) {
                z = true;
            }
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                c15578l2 = c15578l;
                objM2132native = new C3005l(abstractC18082l, c15578l2, i3);
                c6956l.m2147try(objM2132native);
            } else {
                c15578l2 = c15578l;
            }
            AbstractC16336l.loadAd(interfaceC17242l3, null, c17253lLoadAd, c7537l, null, null, false, null, (Function1) objM2132native, c6956l, ((i6 >> 3) & 14) | 24960, 490);
            interfaceC17242l2 = interfaceC17242l3;
        } else {
            c15578l2 = c15578l;
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12348l(abstractC18082l, interfaceC17242l2, c15578l2, i, i2);
        }
    }
}

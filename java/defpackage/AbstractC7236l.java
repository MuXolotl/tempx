package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.RemoteViews;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚْۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7236l {
    public static final C15578l yandex = new C15578l(-741458230, false, new C12851l(26));
    public static final C15578l loadAd = new C15578l(1083376610, false, new C8918l(17));
    public static final C15578l crashlytics = new C15578l(80192488, false, new C12851l(27));
    public static final C15578l amazon = new C15578l(-105302631, false, new C8918l(18));
    public static final C15578l purchase = new C15578l(17601306, false, new C8918l(19));
    public static final C15578l billing = new C15578l(155250553, false, new C12851l(28));
    public static final C15578l mopub = new C15578l(-462719364, false, new C12851l(29));

    public static final String admob(String str) {
        char lowerCase;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char cCharAt = str.charAt(i);
            if ('A' > cCharAt || cCharAt >= '[') {
                lowerCase = (cCharAt < 0 || cCharAt >= 128) ? Character.toLowerCase(cCharAt) : cCharAt;
            } else {
                lowerCase = (char) (cCharAt + ' ');
            }
            if (lowerCase != cCharAt) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str, 0, i);
        int iM3350volatile = AbstractC12024l.m3350volatile(str);
        if (i <= iM3350volatile) {
            while (true) {
                char cCharAt2 = str.charAt(i);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    cCharAt2 = (char) (cCharAt2 + ' ');
                } else if (cCharAt2 < 0 || cCharAt2 >= 128) {
                    cCharAt2 = Character.toLowerCase(cCharAt2);
                }
                sb.append(cCharAt2);
                if (i == iM3350volatile) {
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }

    public static boolean amazon(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final float billing(C4974l c4974l, C4974l c4974l2, float f) {
        int iNextInt;
        int i;
        if (0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f).toString());
        }
        Iterator it = AbstractC8576l.adcel(0, c4974l.loadAd).iterator();
        while (true) {
            C16991l c16991l = (C16991l) it;
            if (!c16991l.f33123l) {
                C1759l.firebase("Collection contains no element matching the predicate.");
                return 0.0f;
            }
            iNextInt = c16991l.nextInt();
            float fLoadAd = c4974l.loadAd(iNextInt);
            i = iNextInt + 1;
            float fLoadAd2 = c4974l.loadAd(i % c4974l.loadAd);
            if (fLoadAd2 >= fLoadAd) {
                if (fLoadAd <= f && f <= fLoadAd2) {
                    break;
                }
            } else if (f >= fLoadAd || f <= fLoadAd2) {
                break;
            }
        }
        int i2 = i % c4974l.loadAd;
        float fCrashlytics = AbstractC12481l.crashlytics(c4974l.loadAd(i2) - c4974l.loadAd(iNextInt));
        return AbstractC12481l.crashlytics((AbstractC12481l.crashlytics(c4974l2.loadAd(i2) - c4974l2.loadAd(iNextInt)) * (fCrashlytics < 0.001f ? 0.5f : AbstractC12481l.crashlytics(f - c4974l.loadAd(iNextInt)) / fCrashlytics)) + c4974l2.loadAd(iNextInt));
    }

    public static final void crashlytics(Context context, RemoteViews remoteViews, C8079l c8079l, int i) {
        AbstractC11876l abstractC11876l = c8079l.yandex;
        int i2 = Build.VERSION.SDK_INT;
        C1617l c1617l = C1617l.yandex;
        C10365l c10365l = C10365l.yandex;
        if (i2 < 31) {
            if (AbstractC14055l.remoteconfig(c10365l, C16589l.yandex, c1617l).contains(AbstractC5267l.purchase(abstractC11876l, context))) {
                return;
            }
            C10754l.startapp(abstractC11876l, " requires a complex layout before API 31", "Using a width of ");
        } else if (i2 >= 33 || !AbstractC14055l.remoteconfig(c10365l, c1617l).contains(abstractC11876l)) {
            C5967l.crashlytics(remoteViews, i, abstractC11876l);
        }
    }

    public static final void loadAd(Context context, RemoteViews remoteViews, C4538l c4538l, int i) {
        AbstractC11876l abstractC11876l = c4538l.yandex;
        int i2 = Build.VERSION.SDK_INT;
        C1617l c1617l = C1617l.yandex;
        C10365l c10365l = C10365l.yandex;
        if (i2 < 31) {
            if (AbstractC14055l.remoteconfig(c10365l, C16589l.yandex, c1617l).contains(AbstractC5267l.purchase(abstractC11876l, context))) {
                return;
            }
            C10754l.startapp(abstractC11876l, " requires a complex layout before API 31", "Using a height of ");
        } else if (i2 >= 33 || !AbstractC14055l.remoteconfig(c10365l, c1617l).contains(abstractC11876l)) {
            C5967l.loadAd(remoteViews, i, abstractC11876l);
        }
    }

    public static final float mopub(float f, float f2) {
        float fAbs = Math.abs(f - f2);
        return Math.min(fAbs, 1.0f - fAbs);
    }

    public static final boolean purchase(AbstractC11876l abstractC11876l) {
        if ((abstractC11876l instanceof C9402l) || (abstractC11876l instanceof C3287l)) {
            return true;
        }
        if (!AbstractC8576l.yandex(abstractC11876l, C1617l.yandex) && !AbstractC8576l.yandex(abstractC11876l, C16589l.yandex) && !AbstractC8576l.yandex(abstractC11876l, C10365l.yandex) && abstractC11876l != null) {
            C18725l.billing();
        }
        return false;
    }

    public static final void subs(C4974l c4974l) {
        int i = c4974l.loadAd;
        if (i == 0) {
            AbstractC13082l.purchase("FloatList is empty.");
            throw null;
        }
        float f = c4974l.yandex[i - 1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float fLoadAd = c4974l.loadAd(i2);
            if (fLoadAd < 0.0f || fLoadAd >= 1.0f) {
                C10754l.metrica("FloatMapping - Progress outside of range: ".concat(C4974l.crashlytics(c4974l, 31)));
                return;
            }
            if (mopub(fLoadAd, f) <= 1.0E-4f) {
                C10754l.metrica("FloatMapping - Progress repeats a value: ".concat(C4974l.crashlytics(c4974l, 31)));
                return;
            } else if (fLoadAd < f && (i3 = i3 + 1) > 1) {
                C10754l.metrica("FloatMapping - Progress wraps more than once: ".concat(C4974l.crashlytics(c4974l, 31)));
                return;
            } else {
                i2++;
                f = fLoadAd;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0220  */
    /* JADX WARN: Code duplicated, block: B:105:0x0225  */
    /* JADX WARN: Code duplicated, block: B:109:0x0253  */
    /* JADX WARN: Code duplicated, block: B:111:0x0261  */
    /* JADX WARN: Code duplicated, block: B:113:0x026d  */
    /* JADX WARN: Code duplicated, block: B:114:0x026f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0275  */
    /* JADX WARN: Code duplicated, block: B:120:0x028e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0291  */
    /* JADX WARN: Code duplicated, block: B:124:0x0294  */
    /* JADX WARN: Code duplicated, block: B:126:0x0299  */
    /* JADX WARN: Code duplicated, block: B:128:0x029d  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:78:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180  */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:84:0x018c A[Catch: all -> 0x0199, TryCatch #0 {all -> 0x0199, blocks: (B:82:0x0186, B:84:0x018c, B:87:0x019b), top: B:136:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x019b A[Catch: all -> 0x0199, TRY_LEAVE, TryCatch #0 {all -> 0x0199, blocks: (B:82:0x0186, B:84:0x018c, B:87:0x019b), top: B:136:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d4  */
    public static final void yandex(C4372l c4372l, RemoteViews remoteViews, InterfaceC12001l interfaceC12001l, C5697l c5697l) {
        int i;
        C10700l c10700l;
        Context context;
        C10700l c10700l2;
        C10700l c10700l3;
        C10700l c10700l4;
        C10847l c10847l;
        AbstractC11876l abstractC11876l;
        C1491l c1491l;
        C15827l c15827l;
        int iOrdinal;
        Object obj;
        Object obj2;
        List list;
        float fAdmob;
        float fAdmob2;
        boolean z;
        float f;
        InterfaceC12133l interfaceC12133l;
        Integer num;
        int iIntValue;
        int i2;
        Context context2 = c4372l.yandex;
        C10700l c10700l5 = new C10700l();
        C10700l c10700l6 = new C10700l();
        C10700l c10700l7 = new C10700l();
        C10700l c10700l8 = new C10700l();
        C10700l c10700l9 = new C10700l();
        c10700l9.f21708l = EnumC4386l.f8921l;
        C10700l c10700l10 = new C10700l();
        C10700l c10700l11 = new C10700l();
        C10700l c10700l12 = new C10700l();
        C10700l c10700l13 = new C10700l();
        interfaceC12001l.purchase(Unit.INSTANCE, new C10874l(c10700l10, c10700l5, c10700l6, context2, remoteViews, c5697l, c10700l7, c10700l9, c10700l8, c4372l, c10700l12, c10700l11, c10700l13));
        C8079l c8079l = (C8079l) c10700l5.f21708l;
        C4538l c4538l = (C4538l) c10700l6.f21708l;
        Map map = AbstractC5267l.yandex;
        int i3 = c5697l.loadAd;
        int i4 = c5697l.yandex;
        int i5 = 0;
        if (i3 != -1) {
            if (Build.VERSION.SDK_INT >= 31) {
                C8339l.smaato("There is currently no valid use case where a complex view is used on Android S");
                return;
            }
            AbstractC11876l abstractC11876l2 = c8079l != null ? c8079l.yandex : null;
            AbstractC11876l abstractC11876l3 = c4538l != null ? c4538l.yandex : null;
            if (purchase(abstractC11876l2) || purchase(abstractC11876l3)) {
                boolean z2 = (abstractC11876l2 instanceof C16589l) || (abstractC11876l2 instanceof C1617l);
                boolean z3 = (abstractC11876l3 instanceof C16589l) || (abstractC11876l3 instanceof C1617l);
                if (z2 && z3) {
                    i = R.layout.size_match_match;
                } else if (z2) {
                    i = R.layout.size_match_wrap;
                } else {
                    i = z3 ? R.layout.size_wrap_match : R.layout.size_wrap_wrap;
                }
                c10700l = c10700l9;
                int iCrashlytics = AbstractC10547l.crashlytics(remoteViews, c4372l, R.id.sizeViewStub, i, null);
                boolean z4 = abstractC11876l2 instanceof C9402l;
                context = context2;
                C10365l c10365l = C10365l.yandex;
                C16589l c16589l = C16589l.yandex;
                c10700l2 = c10700l13;
                C1617l c1617l = C1617l.yandex;
                if (z4) {
                    c10700l4 = c10700l11;
                    c10700l3 = c10700l12;
                    remoteViews.setInt(iCrashlytics, "setWidth", (int) TypedValue.applyDimension(1, ((C9402l) abstractC11876l2).yandex, context.getResources().getDisplayMetrics()));
                } else {
                    c10700l3 = c10700l12;
                    c10700l4 = c10700l11;
                    if (abstractC11876l2 instanceof C3287l) {
                        remoteViews.setInt(iCrashlytics, "setWidth", context.getResources().getDimensionPixelSize(((C3287l) abstractC11876l2).yandex));
                    } else if (!AbstractC8576l.yandex(abstractC11876l2, c1617l) && !AbstractC8576l.yandex(abstractC11876l2, c16589l) && !AbstractC8576l.yandex(abstractC11876l2, c10365l) && abstractC11876l2 != null) {
                        C18725l.billing();
                        return;
                    }
                }
                if (abstractC11876l3 instanceof C9402l) {
                    remoteViews.setInt(iCrashlytics, "setHeight", (int) TypedValue.applyDimension(1, ((C9402l) abstractC11876l3).yandex, context.getResources().getDisplayMetrics()));
                } else if (abstractC11876l3 instanceof C3287l) {
                    remoteViews.setInt(iCrashlytics, "setHeight", context.getResources().getDimensionPixelSize(((C3287l) abstractC11876l3).yandex));
                } else if (!AbstractC8576l.yandex(abstractC11876l3, c1617l) && !AbstractC8576l.yandex(abstractC11876l3, c16589l) && !AbstractC8576l.yandex(abstractC11876l3, c10365l) && abstractC11876l3 != null) {
                    C18725l.billing();
                    return;
                }
            }
            c10847l = (C10847l) c10700l10.f21708l;
            if (c10847l != null) {
                interfaceC12133l = c10847l.yandex;
                num = c4372l.remoteconfig;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = i4;
                }
                try {
                    i2 = 17;
                    if (c4372l.billing) {
                        remoteViews.setOnClickFillInIntent(iIntValue, AbstractC16570l.crashlytics(interfaceC12133l, c4372l, iIntValue, new C13206l(i2)));
                    } else {
                        remoteViews.setOnClickPendingIntent(iIntValue, AbstractC16570l.amazon(interfaceC12133l, c4372l, iIntValue, new C13206l(i2)));
                    }
                } catch (Throwable th) {
                    Log.e("GlanceAppWidget", "Unrecognized Action: " + interfaceC12133l, th);
                }
            }
            abstractC11876l = (AbstractC11876l) c10700l8.f21708l;
            if (abstractC11876l != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C5967l.yandex(remoteViews, i4, abstractC11876l);
                } else {
                    Log.w("GlanceAppWidget", "Cannot set the rounded corner of views before Api 31.");
                }
            }
            c1491l = (C1491l) c10700l7.f21708l;
            if (c1491l != null) {
                Resources resources = context.getResources();
                C14218l c14218l = c1491l.yandex;
                float fAdmob3 = AbstractC17307l.admob(c14218l.loadAd, resources) + c14218l.yandex;
                C14218l c14218l2 = c1491l.loadAd;
                fAdmob = AbstractC17307l.admob(c14218l2.loadAd, resources) + c14218l2.yandex;
                C14218l c14218l3 = c1491l.crashlytics;
                float fAdmob4 = AbstractC17307l.admob(c14218l3.loadAd, resources) + c14218l3.yandex;
                C14218l c14218l4 = c1491l.amazon;
                float fAdmob5 = AbstractC17307l.admob(c14218l4.loadAd, resources) + c14218l4.yandex;
                C14218l c14218l5 = c1491l.purchase;
                fAdmob2 = AbstractC17307l.admob(c14218l5.loadAd, resources) + c14218l5.yandex;
                C14218l c14218l6 = c1491l.billing;
                float fAdmob6 = AbstractC17307l.admob(c14218l6.loadAd, resources) + c14218l6.yandex;
                z = c4372l.crashlytics;
                if (z) {
                    f = fAdmob2;
                } else {
                    f = fAdmob;
                }
                float f2 = fAdmob3 + f;
                if (!z) {
                    fAdmob = fAdmob2;
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                remoteViews.setViewPadding(c5697l.yandex, (int) TypedValue.applyDimension(1, f2, displayMetrics), (int) TypedValue.applyDimension(1, fAdmob4, displayMetrics), (int) TypedValue.applyDimension(1, fAdmob5 + fAdmob, displayMetrics), (int) TypedValue.applyDimension(1, fAdmob6, displayMetrics));
            }
            if (c10700l3.f21708l == null) {
                C18725l.loadAd();
                return;
            }
            c15827l = (C15827l) c10700l2.f21708l;
            if (c15827l != null) {
                obj = c15827l.yandex.yandex.get(AbstractC5548l.yandex);
                if (obj == null) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                list = (List) obj2;
                if (list != null) {
                    remoteViews.setContentDescription(i4, AbstractC16901l.m4210case(list, null, null, null, null, 63));
                }
            }
            iOrdinal = ((EnumC4386l) c10700l.f21708l).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    i5 = 4;
                } else {
                    if (iOrdinal == 2) {
                        C18725l.billing();
                        return;
                    }
                    i5 = 8;
                }
            }
            remoteViews.setViewVisibility(i4, i5);
        }
        if (c8079l != null) {
            crashlytics(context2, remoteViews, c8079l, i4);
        }
        if (c4538l != null) {
            loadAd(context2, remoteViews, c4538l, i4);
        }
        context = context2;
        c10700l = c10700l9;
        c10700l3 = c10700l12;
        c10700l4 = c10700l11;
        c10700l2 = c10700l13;
        c10847l = (C10847l) c10700l10.f21708l;
        if (c10847l != null) {
            interfaceC12133l = c10847l.yandex;
            num = c4372l.remoteconfig;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = i4;
            }
            i2 = 17;
            if (c4372l.billing) {
                remoteViews.setOnClickFillInIntent(iIntValue, AbstractC16570l.crashlytics(interfaceC12133l, c4372l, iIntValue, new C13206l(i2)));
            } else {
                remoteViews.setOnClickPendingIntent(iIntValue, AbstractC16570l.amazon(interfaceC12133l, c4372l, iIntValue, new C13206l(i2)));
            }
        }
        abstractC11876l = (AbstractC11876l) c10700l8.f21708l;
        if (abstractC11876l != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                C5967l.yandex(remoteViews, i4, abstractC11876l);
            } else {
                Log.w("GlanceAppWidget", "Cannot set the rounded corner of views before Api 31.");
            }
        }
        c1491l = (C1491l) c10700l7.f21708l;
        if (c1491l != null) {
            Resources resources2 = context.getResources();
            C14218l c14218l7 = c1491l.yandex;
            float fAdmob7 = AbstractC17307l.admob(c14218l7.loadAd, resources2) + c14218l7.yandex;
            C14218l c14218l8 = c1491l.loadAd;
            fAdmob = AbstractC17307l.admob(c14218l8.loadAd, resources2) + c14218l8.yandex;
            C14218l c14218l9 = c1491l.crashlytics;
            float fAdmob8 = AbstractC17307l.admob(c14218l9.loadAd, resources2) + c14218l9.yandex;
            C14218l c14218l10 = c1491l.amazon;
            float fAdmob9 = AbstractC17307l.admob(c14218l10.loadAd, resources2) + c14218l10.yandex;
            C14218l c14218l11 = c1491l.purchase;
            fAdmob2 = AbstractC17307l.admob(c14218l11.loadAd, resources2) + c14218l11.yandex;
            C14218l c14218l12 = c1491l.billing;
            float fAdmob10 = AbstractC17307l.admob(c14218l12.loadAd, resources2) + c14218l12.yandex;
            z = c4372l.crashlytics;
            if (z) {
                f = fAdmob2;
            } else {
                f = fAdmob;
            }
            float f3 = fAdmob7 + f;
            if (!z) {
                fAdmob = fAdmob2;
            }
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            remoteViews.setViewPadding(c5697l.yandex, (int) TypedValue.applyDimension(1, f3, displayMetrics2), (int) TypedValue.applyDimension(1, fAdmob8, displayMetrics2), (int) TypedValue.applyDimension(1, fAdmob9 + fAdmob, displayMetrics2), (int) TypedValue.applyDimension(1, fAdmob10, displayMetrics2));
        }
        if (c10700l3.f21708l == null) {
            C18725l.loadAd();
            return;
        }
        c15827l = (C15827l) c10700l2.f21708l;
        if (c15827l != null) {
            obj = c15827l.yandex.yandex.get(AbstractC5548l.yandex);
            if (obj == null) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            list = (List) obj2;
            if (list != null) {
                remoteViews.setContentDescription(i4, AbstractC16901l.m4210case(list, null, null, null, null, 63));
            }
        }
        iOrdinal = ((EnumC4386l) c10700l.f21708l).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i5 = 4;
            } else {
                if (iOrdinal == 2) {
                    C18725l.billing();
                    return;
                }
                i5 = 8;
            }
        }
        remoteViews.setViewVisibility(i4, i5);
    }
}

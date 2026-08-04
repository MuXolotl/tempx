package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٍؘٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9673l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19752l;

    public /* synthetic */ C9673l(C8420l c8420l) {
        this.f19752l = 1;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x02cf  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = 1;
        C16076l c16076l = null;
        int i2 = 0;
        switch (this.f19752l) {
            case 0:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 1:
                throw AbstractC12589l.signatures(obj);
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                C16076l c16076l2 = VKXApplication.f36632l;
                c16076l = c16076l2 != null ? c16076l2 : null;
                c16076l.getClass();
                c16076l.admob(new C13485l(c16076l, fFloatValue, i2));
                return Unit.INSTANCE;
            case 3:
                float fFloatValue2 = ((Float) obj).floatValue();
                C16076l c16076l3 = VKXApplication.f36632l;
                C16076l c16076l4 = c16076l3 != null ? c16076l3 : null;
                c16076l4.getClass();
                c16076l4.admob(new C13485l(c16076l4, fFloatValue2, i));
                return Unit.INSTANCE;
            case 4:
                return Unit.INSTANCE;
            case 5:
                return C0466l.loadAd;
            case 6:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                while (i2 < size) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i2);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                    i2++;
                }
                return arrayList;
            case 7:
                C10942l c10942l = (C10942l) obj;
                c10942l.yandex = 1332;
                c10942l.yandex(Float.valueOf(0.0f), 0).loadAd = AbstractC16978l.yandex;
                c10942l.yandex(Float.valueOf(290.0f), 666);
                return Unit.INSTANCE;
            case 8:
                C10942l c10942l2 = (C10942l) obj;
                c10942l2.yandex = 1332;
                c10942l2.yandex(Float.valueOf(0.0f), 666).loadAd = AbstractC16978l.yandex;
                c10942l2.yandex(Float.valueOf(290.0f), c10942l2.yandex);
                return Unit.INSTANCE;
            case 9:
                C10942l c10942l3 = (C10942l) obj;
                c10942l3.yandex = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                c10942l3.yandex(fValueOf, 300).loadAd = AbstractC9528l.loadAd;
                c10942l3.yandex(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                c10942l3.yandex(fValueOf2, 1800);
                c10942l3.yandex(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                c10942l3.yandex(fValueOf3, 3300);
                c10942l3.yandex(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                c10942l3.yandex(fValueOf4, 4800);
                c10942l3.yandex(fValueOf4, 6000);
                return Unit.INSTANCE;
            case 10:
                AbstractC3668l.smaato((InterfaceC17593l) obj, C14519l.amazon);
                return Unit.INSTANCE;
            case 11:
                return new C14286l((Cursor) obj);
            case 12:
                Cursor cursor = (Cursor) obj;
                if (C14965l.f29439l == null) {
                    VKXApplication vKXApplication = VKXApplication.f36631l;
                    if (vKXApplication == null) {
                        vKXApplication = null;
                    }
                    C14965l.f29439l = new C14965l(vKXApplication.getApplicationContext().getContentResolver());
                }
                C14965l c14965l = C14965l.f29439l;
                return new C13884l(cursor, (C16820l) AbstractC10000l.ad(c14965l != null ? c14965l : null, new C0554l(new C8392l(2), new C11318l(false, 9), new AbstractC1401l[]{new C2645l(cursor.getLong(0))})).get(0));
            case 13:
                return new C16820l((Cursor) obj);
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                C6742l c6742l = (C6742l) obj;
                C18449l c18449l = c6742l.f14144l.f26629l;
                long jM4551private = c18449l.m4551private();
                c18449l.m4555synchronized().mopub();
                try {
                    ((C16543l) c18449l.f36010l).remoteconfig(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    c6742l.yandex();
                    return Unit.INSTANCE;
                } finally {
                    AbstractC0653l.license(c18449l, jM4551private);
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6742l c6742l2 = (C6742l) obj;
                C18449l c18449l2 = c6742l2.f14144l.f26629l;
                long jM4551private2 = c18449l2.m4551private();
                c18449l2.m4555synchronized().mopub();
                try {
                    ((C16543l) c18449l2.f36010l).remoteconfig(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    c6742l2.yandex();
                    return Unit.INSTANCE;
                } finally {
                    AbstractC0653l.license(c18449l2, jM4551private2);
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Float f = (Float) obj;
                f.getClass();
                return new C7806l(new C5616l(f, AbstractC3483l.purchase, c16076l, 12));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6099l c6099l = (C6099l) obj;
                AbstractC4338l.m1533private(c6099l, new C9673l(20));
                C18396l c18396l = c6099l.yandex;
                C8298l c8298l = InterfaceC6407l.yandex;
                long j = C9735l.loadAd;
                c18396l.f35933l = C0820l.yandex((C0820l) c18396l.f35933l, AbstractC5711l.subs(j), null, 14);
                c18396l.f35933l = C0820l.yandex((C0820l) c18396l.f35933l, null, AbstractC5711l.subs(j), 7);
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            case 20:
                C18677l c18677l = (C18677l) obj;
                C10560l c10560l = InterfaceC3538l.f7432l;
                c18677l.yandex(new C10975l(22));
                C4887l c4887l = InterfaceC1519l.f3792l;
                c18677l.loadAd(new C16543l((byte) 0, 23));
                c18677l.crashlytics(new C7112l(1.0f, true, true, true, true));
                return Unit.INSTANCE;
            case 21:
                String str2 = (String) obj;
                C16076l c16076l5 = VKXApplication.f36632l;
                return (c16076l5 != null ? c16076l5 : null).f31521l.subs(str2);
            case 22:
                return Boolean.FALSE;
            case 23:
                throw new IllegalArgumentException("Sets cannot contain other collections ");
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                throw new IllegalArgumentException("Sets cannot contain other collections ");
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C10942l c10942l4 = (C10942l) obj;
                c10942l4.yandex = 1332;
                c10942l4.yandex(Float.valueOf(0.0f), 0).loadAd = AbstractC16888l.yandex;
                c10942l4.yandex(Float.valueOf(290.0f), 666);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C10942l c10942l5 = (C10942l) obj;
                c10942l5.yandex = 1332;
                c10942l5.yandex(Float.valueOf(0.0f), 0).loadAd = AbstractC12491l.yandex;
                c10942l5.yandex(Float.valueOf(290.0f), 666);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C10942l c10942l6 = (C10942l) obj;
                c10942l6.yandex = 1332;
                c10942l6.yandex(Float.valueOf(0.0f), 666).loadAd = AbstractC16888l.yandex;
                c10942l6.yandex(Float.valueOf(290.0f), c10942l6.yandex);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C10942l c10942l7 = (C10942l) obj;
                c10942l7.yandex = 1332;
                c10942l7.yandex(Float.valueOf(0.0f), 666).loadAd = AbstractC12491l.yandex;
                c10942l7.yandex(Float.valueOf(290.0f), c10942l7.yandex);
                return Unit.INSTANCE;
            default:
                C14025l c14025l = C18131l.f35441l;
                return Boolean.valueOf(C10819l.firebase(((C11018l) obj).yandex));
        }
    }

    public /* synthetic */ C9673l(int i) {
        this.f19752l = i;
    }
}

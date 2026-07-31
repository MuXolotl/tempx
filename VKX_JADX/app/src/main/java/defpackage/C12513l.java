package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lَّٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12513l implements Function2 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24652l;

    public /* synthetic */ C12513l(int i) {
        this.f24652l = 15;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24652l) {
            case 0:
                return ((InterfaceC12932l) obj).mo246l((InterfaceC5763l) obj2);
            case 1:
                return ((InterfaceC12932l) obj).mo246l((InterfaceC5763l) obj2);
            case 2:
                Throwable cancellationException = (Throwable) obj2;
                C9426l c9426l = ((C6394l) obj).loadAd;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                c9426l.m2649l(cancellationException);
                return Unit.INSTANCE;
            case 3:
                int i = DedicatedCacheMigrationService.f36651l;
                return EnumC6374l.f13345l;
            case 4:
                C2887l c2887l = (C2887l) obj2;
                return AbstractC14055l.remoteconfig(Integer.valueOf(((C15308l) c2887l.amazon.f32506l).admob()), Float.valueOf(AbstractC8576l.amazon(((C13765l) c2887l.amazon.f32505l).admob(), -0.5f, 0.5f)), Integer.valueOf(c2887l.smaato()));
            case 5:
                return Unit.INSTANCE;
            case 6:
                CharSequence charSequence = (CharSequence) obj2;
                StringBuilder sb = new StringBuilder();
                int length = charSequence.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = charSequence.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                return sb;
            case 7:
                CharSequence charSequence2 = (CharSequence) obj2;
                StringBuilder sb2 = new StringBuilder();
                int length2 = charSequence2.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    char cCharAt2 = charSequence2.charAt(i3);
                    if (Character.isDigit(cCharAt2)) {
                        sb2.append(cCharAt2);
                    }
                }
                return sb2;
            case 8:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.settings_experimental_vkru), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                String str = "vk.com";
                if (!zBooleanValue && zBooleanValue2) {
                    str = "vk.ru";
                }
                AbstractC9549l.purchase = str;
                return Unit.INSTANCE;
            case 10:
                return Boolean.valueOf(AbstractC8576l.yandex(obj, obj2));
            case 11:
                char cCharValue = ((Character) obj).charValue();
                ((Integer) obj2).intValue();
                return Boolean.valueOf(cCharValue == ' ');
            case 12:
                char cCharValue2 = ((Character) obj).charValue();
                ((Integer) obj2).intValue();
                return Boolean.valueOf(cCharValue2 == ' ');
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Long.valueOf(AbstractC4777l.f9804l.admob() + Math.min((long) (Math.pow(2.0d, ((Integer) obj2).intValue() - 1) * 1000.0d), 60000L));
            case 15:
                ((Integer) obj2).getClass();
                AbstractC3957l.yandex((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 16:
                ((C13074l) obj).loadAd = (InterfaceC17045l) obj2;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C13074l) obj).yandex = (InterfaceC12001l) obj2;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C13074l) obj).purchase = ((C0219l) obj2).yandex;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C2607l c2607l = (C2607l) obj2;
                ((C13074l) obj).crashlytics = c2607l != null ? c2607l.yandex : null;
                return Unit.INSTANCE;
            case 20:
                ((C13074l) obj).amazon = (Float) obj2;
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                return new C1398l(1L);
            case 22:
                C8232l c8232l = (C8232l) obj2;
                return AbstractC14055l.remoteconfig(Integer.valueOf(c8232l.amazon.loadAd.admob()), Integer.valueOf(c8232l.amazon.crashlytics.admob()));
            case 23:
                C5866l c5866l = (C5866l) obj2;
                return AbstractC14055l.remoteconfig(Integer.valueOf(c5866l.purchase.loadAd.admob()), Integer.valueOf(c5866l.purchase.crashlytics.admob()));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                Map mapAmazon = ((C10641l) obj2).amazon();
                if (mapAmazon.isEmpty()) {
                    return null;
                }
                return mapAmazon;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C7403l c7403l = ((C7583l) obj2).crashlytics;
                return AbstractC14055l.remoteconfig((int[]) c7403l.f15341l, (int[]) c7403l.f15340l);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6956l c6956l2 = (C6956l) obj;
                ((Integer) obj2).getClass();
                c6956l2.m2123default(-511854661);
                WeakHashMap weakHashMap = C12923l.pro;
                C1628l c1628l = new C1628l(C6760l.smaato(c6956l2).smaato, 48);
                c6956l2.startapp(false);
                return c1628l;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC7039l.remoteconfig.invoke(c6956l3, 0);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC7039l.vip.invoke(c6956l4, 0);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            default:
                int i4 = NextDockView.f36847l;
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C12513l(byte b, int i) {
        this.f24652l = i;
    }

    public /* synthetic */ C12513l(int i, Object obj) {
        this.f24652l = i;
    }
}

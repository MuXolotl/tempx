package defpackage;

import android.media.audiofx.AudioEffect;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًۣؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1712l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4099l;

    public /* synthetic */ C1712l(C14965l c14965l) {
        this.f4099l = 3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object c18435l;
        int i = this.f4099l;
        C5746l c5746l = C5746l.f12138l;
        long j = 0;
        int iNextSetBit = 0;
        switch (i) {
            case 0:
                return false;
            case 1:
                return Unit.INSTANCE;
            case 2:
                try {
                    AudioEffect.Descriptor[] descriptorArrQueryEffects = AudioEffect.queryEffects();
                    ArrayList arrayList = new ArrayList(descriptorArrQueryEffects.length);
                    int length = descriptorArrQueryEffects.length;
                    while (iNextSetBit < length) {
                        arrayList.add(descriptorArrQueryEffects[iNextSetBit].type);
                        iNextSetBit++;
                    }
                    c18435l = AbstractC16901l.m4229l(arrayList);
                    break;
                } catch (Throwable th) {
                    c18435l = new C18435l(th);
                }
                Set set = (Set) (c18435l instanceof C18435l ? null : c18435l);
                return set == null ? c5746l : set;
            case 3:
                String str = "";
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.backported_fixes.alias_bitset.long_list", "");
                } catch (Exception unused) {
                }
                C10227l c10227lAdmob = AbstractC14055l.admob();
                Iterator it = AbstractC12024l.m3323finally(str, new char[]{','}).iterator();
                while (it.hasNext()) {
                    try {
                        c10227lAdmob.add(Long.valueOf(Long.parseLong((String) it.next())));
                    } catch (NumberFormatException unused2) {
                    }
                }
                BitSet bitSetValueOf = BitSet.valueOf(AbstractC16901l.m4237return(AbstractC14055l.purchase(c10227lAdmob)));
                int size = bitSetValueOf.size();
                if (size == 0) {
                    return c5746l;
                }
                C4344l c4344l = new C4344l(new C17963l(size));
                while (iNextSetBit >= 0) {
                    if (bitSetValueOf.get(iNextSetBit)) {
                        c4344l.add(Integer.valueOf(iNextSetBit));
                    }
                    if (iNextSetBit == Integer.MAX_VALUE) {
                        return AbstractC9905l.yandex(c4344l);
                    }
                    iNextSetBit = bitSetValueOf.nextSetBit(iNextSetBit + 1);
                }
                return AbstractC9905l.yandex(c4344l);
            case 4:
                return Unit.INSTANCE;
            case 5:
                C8540l c8540l = AbstractC8574l.yandex;
                return null;
            case 6:
                return AbstractC14880l.yandex;
            case 7:
                return AbstractC18397l.yandex;
            case 8:
                return new C5177l(j);
            case 9:
                return new C5177l(j);
            case 10:
                return AbstractC8226l.yandex;
            case 11:
                InterfaceC18035l[] interfaceC18035lArr = new InterfaceC18035l[0];
                if (AbstractC12024l.m3315catch("kotlinx.datetime.TimeBased")) {
                    C8339l.metrica("Blank serial names are prohibited");
                    return null;
                }
                C14416l c14416l = new C14416l("kotlinx.datetime.TimeBased");
                c14416l.yandex(C2010l.loadAd, "nanoseconds");
                Unit unit = Unit.INSTANCE;
                return new C16413l("kotlinx.datetime.TimeBased", C16015l.amazon, c14416l.crashlytics.size(), AbstractC8669l.m2415super(interfaceC18035lArr), c14416l);
            case 12:
                C17253l c17253l = AbstractC0831l.yandex;
                return Boolean.TRUE;
            case 13:
                C13645l c13645l = C6935l.purchase;
                return Boolean.TRUE;
            case 14:
                return Boolean.TRUE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                C12772l c12772l = new C12772l(AbstractC15560l.ads(((C4645l) AbstractC16584l.loadAd().f15735l).yandex, "?section=all", new StringBuilder("https://vk.com/audios")), 8);
                C8688l c8688l = C10328l.purchase;
                c12772l.loadAd = AbstractC10409l.crashlytics().amazon.ads();
                return c12772l;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C12772l c12772l2 = new C12772l(AbstractC15560l.ads(((C4645l) AbstractC16584l.loadAd().f15735l).yandex, "?section=general", new StringBuilder("https://vk.com/audios")), 8);
                C8688l c8688l2 = C10328l.purchase;
                c12772l2.loadAd = AbstractC10409l.crashlytics().amazon.ads();
                return c12772l2;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return AbstractC0079l.subs("ua.itaysonlab.vkxtv.components.main.TvMainNavigationComponent.NavigationPage", EnumC9157l.values(), new String[]{"search", "main", "library", "now_playing", "settings"}, new Annotation[][]{null, null, null, null, null});
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return new C9472l(null, null, null, null, null, null, 32767);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C13494l(null, null, null, null, null, null, null, null, null, 32767);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C13815l c13815l = new C13815l(new C4384l());
                AbstractC2991l.mopub(c13815l, new Function1[]{new C12176l(12)}, new C12176l(13));
                Unit unit2 = Unit.INSTANCE;
                return new C1761l(AbstractC5020l.crashlytics(c13815l));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C4384l c4384l = new C4384l();
                c4384l.yandex(new C9182l(new C9695l(new C17111l(2))));
                c4384l.yandex(new C9695l(new C10400l(2)));
                Unit unit3 = Unit.INSTANCE;
                return new C1761l(new C15977l(c4384l.yandex));
            default:
                C13815l c13815l2 = new C13815l(new C4384l());
                AbstractC2991l.mopub(c13815l2, new Function1[]{new C12176l(10)}, new C12176l(11));
                Unit unit4 = Unit.INSTANCE;
                return new C1761l(AbstractC5020l.crashlytics(c13815l2));
        }
    }

    public /* synthetic */ C1712l(int i) {
        this.f4099l = i;
    }
}

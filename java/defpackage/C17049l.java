package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.net.NetworkInterface;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;

/* JADX INFO: renamed from: lُٗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C17049l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33209l;

    public /* synthetic */ C17049l(C0841l c0841l) {
        this.f33209l = 4;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:4: B:59:0x0152->B:162:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x014e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0158  */
    /* JADX WARN: Code duplicated, block: B:66:0x0175  */
    /* JADX WARN: Code duplicated, block: B:68:0x0181  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ae  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Set setKeySet;
        Iterator it;
        String string;
        StringBuilder sb;
        double d;
        int i = 5;
        int i2 = 0;
        InterfaceC14029l interfaceC14029l = null;
        int i3 = 1;
        switch (this.f33209l) {
            case 0:
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", (C16916l) obj);
                return C8565l.f17668l;
            case 1:
                AbstractC3668l.remoteconfig((InterfaceC17593l) obj, 0);
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                return Unit.INSTANCE;
            case 4:
                return (C14025l) obj;
            case 5:
                return Boolean.valueOf(AbstractC8576l.yandex(AbstractC1788l.isPro((C18010l) obj, "type"), "song"));
            case 6:
                return AbstractC1788l.amazon((C18010l) obj, "hits");
            case 7:
                return AbstractC1788l.purchase(AbstractC8358l.mopub((AbstractC9914l) obj), "result");
            case 8:
                String strIsPro = AbstractC1788l.isPro((C18010l) obj, "title");
                return strIsPro == null ? "" : strIsPro;
            case 9:
                AbstractC1213l.billing((Context) obj, new C15191l((String) null, new C1990l(11)));
                return Unit.INSTANCE;
            case 10:
                synchronized (AbstractC9620l.crashlytics) {
                    List list = AbstractC9620l.subs;
                    int size = list.size();
                    while (i2 < size) {
                        ((Function1) list.get(i2)).invoke(obj);
                        i2++;
                    }
                }
                return Unit.INSTANCE;
            case 11:
                return ((AudioBook.Link) obj).loadAd;
            case 12:
                String strGroup = ((C0711l) obj).yandex.group();
                int length = strGroup.length();
                return strGroup.substring(length - (1 > length ? length : 1));
            case 13:
                C12825l c12825l = (C12825l) obj;
                C0394l c0394l = (C0394l) c12825l.loadAd;
                List listM4240super = AbstractC16901l.m4240super(c0394l.yandex);
                List listM4240super2 = AbstractC16901l.m4240super(c0394l.loadAd);
                c12825l.yandex(C1083l.f2994l, new C8751l(c0394l.crashlytics, interfaceC14029l, i2));
                c12825l.yandex(C17334l.f33661l, new C12207l(listM4240super, interfaceC14029l, i));
                c12825l.yandex(C6168l.f12999l, new C14847l(i2, interfaceC14029l, listM4240super2));
                c12825l.yandex(C6928l.f14511l, new C14847l(i3, interfaceC14029l, listM4240super2));
                return Unit.INSTANCE;
            case 14:
                C16864l c16864l = (C16864l) obj;
                InterfaceC6272l interfaceC6272l = AbstractC15330l.yandex;
                int i4 = 3;
                c16864l.f32922l.firebase(C8403l.f17385l, new C7690l(i4, interfaceC14029l, 2));
                C8403l c8403l = c16864l.f32913l;
                C12222l c12222l = C8403l.f17377l;
                c8403l.firebase(c12222l, new C4709l(c16864l, null));
                c8403l.firebase(c12222l, new C7306l(i4, interfaceC14029l, i3));
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C12825l c12825l2 = (C12825l) obj;
                C8321l c8321l = (C8321l) c12825l2.loadAd;
                LinkedHashMap linkedHashMap = c8321l.loadAd;
                List<C8195l> listM4243this = AbstractC16901l.m4243this(AbstractC8676l.ads(linkedHashMap), new C13617l(27));
                Charset charset = c8321l.crashlytics;
                LinkedHashSet linkedHashSet = c8321l.yandex;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : linkedHashSet) {
                    if (!linkedHashMap.containsKey((Charset) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                List<Charset> listM4243this2 = AbstractC16901l.m4243this(arrayList, new C13617l(26));
                if (linkedHashSet.isEmpty()) {
                    setKeySet = linkedHashMap.keySet();
                    if ((setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                        it = setKeySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!AbstractC8576l.yandex((Charset) it.next(), AbstractC9050l.yandex)) {
                                    sb = new StringBuilder();
                                    for (Charset charset2 : listM4243this2) {
                                        if (sb.length() > 0) {
                                            sb.append(",");
                                        }
                                        sb.append(charset2.name());
                                    }
                                    for (C8195l c8195l : listM4243this) {
                                        Charset charset3 = (Charset) c8195l.f17098l;
                                        float fFloatValue = ((Number) c8195l.f17097l).floatValue();
                                        if (sb.length() > 0) {
                                            sb.append(",");
                                        }
                                        d = fFloatValue;
                                        if (0.0d <= d || d > 1.0d) {
                                            C8339l.smaato("Check failed.");
                                            return null;
                                        }
                                        sb.append(charset3.name() + ";q=" + (((double) AbstractC5573l.ads(100.0f * fFloatValue)) / 100.0d));
                                    }
                                    string = sb.toString();
                                }
                            }
                        }
                    }
                    string = null;
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            setKeySet = linkedHashMap.keySet();
                            if (setKeySet instanceof Collection) {
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!AbstractC8576l.yandex((Charset) it.next(), AbstractC9050l.yandex)) {
                                        }
                                    }
                                }
                            } else {
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!AbstractC8576l.yandex((Charset) it.next(), AbstractC9050l.yandex)) {
                                        }
                                    }
                                }
                            }
                            string = null;
                        } else if (!AbstractC8576l.yandex((Charset) it2.next(), AbstractC9050l.yandex)) {
                        }
                        sb = new StringBuilder();
                        while (r1.hasNext()) {
                            if (sb.length() > 0) {
                                sb.append(",");
                            }
                            sb.append(charset2.name());
                        }
                        while (r1.hasNext()) {
                            Charset charset4 = (Charset) c8195l.f17098l;
                            float fFloatValue2 = ((Number) c8195l.f17097l).floatValue();
                            if (sb.length() > 0) {
                                sb.append(",");
                            }
                            d = fFloatValue2;
                            if (0.0d <= d) {
                            }
                            C8339l.smaato("Check failed.");
                            return null;
                        }
                        string = sb.toString();
                    }
                }
                Charset charset5 = (Charset) AbstractC16901l.m4217extends(listM4243this2);
                if (charset5 == null) {
                    C8195l c8195l2 = (C8195l) AbstractC16901l.m4217extends(listM4243this);
                    charset5 = c8195l2 != null ? (Charset) c8195l2.f17098l : null;
                    if (charset5 == null) {
                        charset5 = AbstractC9050l.yandex;
                    }
                }
                c12825l2.yandex(C15718l.f30876l, new C13680l(string, charset5, null));
                c12825l2.yandex(C15617l.f30500l, new C0003l(charset, null));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C12825l c12825l3 = (C12825l) obj;
                ((C1415l) c12825l3.loadAd).getClass();
                c12825l3.yandex(C17334l.f33661l, new C14082l(c12825l3, interfaceC14029l, i));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C12825l c12825l4 = (C12825l) obj;
                c12825l4.yandex(C11485l.f23092l, new C12207l(c12825l4, interfaceC14029l, 6));
                return Unit.INSTANCE;
            case 20:
                C8195l c8195l3 = (C8195l) obj;
                String strPurchase = AbstractC2208l.purchase((String) c8195l3.f17098l, true);
                Object obj3 = c8195l3.f17097l;
                return obj3 == null ? strPurchase : AbstractC11043l.admob('=', strPurchase, AbstractC2208l.purchase(String.valueOf(obj3), true));
            case 21:
                C6116l c6116l = (C6116l) obj;
                C5254l c5254l = AbstractC14192l.amazon;
                C8804l c8804l = new C8804l();
                InterfaceC12387l c7026l = c5254l.m1754l(AbstractC14192l.yandex) ? C11485l.f23089l : new C7026l(4, c5254l);
                Unit unit = Unit.INSTANCE;
                c6116l.loadAd.add(new C3531l(c8804l, c5254l, c7026l));
                return Unit.INSTANCE;
            case 22:
                return AbstractC17587l.subs(new C4720l(((NetworkInterface) obj).getInetAddresses()));
            case 23:
                ((C9452l) obj).yandex(AbstractC14192l.amazon, new C8804l(), new C4100l(20));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                AbstractC3668l.remoteconfig((InterfaceC17593l) obj, 0);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC3668l.remoteconfig((InterfaceC17593l) obj, 1);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                AbstractC3668l.remoteconfig((InterfaceC17593l) obj, 1);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C2566l) obj).billing(null);
                return Unit.INSTANCE;
            default:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
        }
    }

    public /* synthetic */ C17049l(int i) {
        this.f33209l = i;
    }
}

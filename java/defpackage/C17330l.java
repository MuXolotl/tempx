package defpackage;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٗۖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17330l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f33641l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33642l;

    public /* synthetic */ C17330l(int i, Object obj) {
        this.f33642l = i;
        this.f33641l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x020a  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f0  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        boolean zEquals;
        AbstractC4946l abstractC4946lAdmob;
        boolean z = false;
        byte b = 0;
        int i = 1;
        switch (this.f33642l) {
            case 0:
                C2312l c2312l = (C2312l) obj;
                Map map = (Map) ((C18396l) this.f33641l).f35934l;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    C2312l c2312l2 = (C2312l) entry.getKey();
                    if (!c2312l.equals(c2312l2)) {
                        if (AbstractC8576l.yandex(c2312l.yandex.crashlytics() ? null : c2312l.loadAd(), c2312l2)) {
                        }
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap.isEmpty()) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    return null;
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int length = AbstractC14905l.amazon((C2312l) ((Map.Entry) next).getKey(), c2312l).yandex.yandex.length();
                        do {
                            Object next2 = it.next();
                            int length2 = AbstractC14905l.amazon((C2312l) ((Map.Entry) next2).getKey(), c2312l).yandex.yandex.length();
                            if (length > length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    return entry2.getValue();
                }
                return null;
            case 1:
                ((C4853l) this.f33641l).add(obj);
                return Unit.INSTANCE;
            case 2:
                C9455l c9455l = (C9455l) this.f33641l;
                AbstractC9033l.crashlytics((AppActivity) c9455l.isVip(), new C7226l((Function2) obj, c9455l, b == true ? 1 : 0, 9));
                return Unit.INSTANCE;
            case 3:
                realm_value_t realm_value_tVar = ((C14864l) obj).yandex;
                boolean[] zArr = new boolean[1];
                long ptr$cinterop_release = ((LongPointerWrapper) ((C17219l) this.f33641l).f33426l).getPtr$cinterop_release();
                int i2 = AbstractC9795l.yandex;
                realmcJNI.realm_set_insert(ptr$cinterop_release, realm_value_tVar.yandex, realm_value_tVar, new long[1], zArr);
                return Boolean.valueOf(zArr[0]);
            case 4:
                C12875l c12875l = (C12875l) this.f33641l;
                Method method = (Method) obj;
                if (!method.isSynthetic()) {
                    if (c12875l.yandex.isEnum()) {
                        String name = method.getName();
                        if (AbstractC8576l.yandex(name, "values")) {
                            if (method.getParameterTypes().length == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (AbstractC8576l.yandex(name, "valueOf")) {
                            zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                        } else {
                            zEquals = false;
                        }
                        if (!zEquals) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                AbstractC9361l.isPro((InterfaceC13349l) obj, new C14115l((Bitmap) this.f33641l), 0L, 0.0f, null, 62);
                return Unit.INSTANCE;
            case 6:
                AbstractC2576l.loadAd((InterfaceC13349l) obj, (C11925l) this.f33641l);
                return Unit.INSTANCE;
            case 7:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C13408l c13408l = (C13408l) this.f33641l;
                if (c13408l != null) {
                    c13408l.f26309l = zBooleanValue;
                }
                return Unit.INSTANCE;
            case 8:
                KeyEvent keyEvent = ((C18583l) obj).yandex;
                C0205l c0205l = (C0205l) this.f33641l;
                if (AbstractC16955l.yandex.loadAd(keyEvent) == EnumC14173l.COPY) {
                    c0205l.purchase();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                return ((C17538l) ((InterfaceC0207l) obj).mo1007finally().get(((C17538l) this.f33641l).f34146l)).yandex();
            case 10:
                float[] fArr = ((C10924l) obj).yandex;
                InterfaceC18212l interfaceC18212l = (InterfaceC18212l) this.f33641l;
                if (interfaceC18212l.mopub()) {
                    AbstractC9690l.crashlytics(interfaceC18212l).isPro(interfaceC18212l, fArr);
                }
                return Unit.INSTANCE;
            case 11:
                C2494l c2494l = (C2494l) this.f33641l;
                C3592l c3592l = (C3592l) obj;
                InterfaceC16902l interfaceC16902l = c3592l.yandex;
                C9188l c9188l = c3592l.loadAd;
                Set set = c9188l.purchase;
                if (set != null && set.contains(interfaceC16902l.mo864l())) {
                    return c2494l.m1185l(c9188l);
                }
                AbstractC15211l abstractC15211lAd = interfaceC16902l.ad();
                LinkedHashSet<InterfaceC16902l> linkedHashSet = new LinkedHashSet();
                AbstractC12300l.purchase(abstractC15211lAd, abstractC15211lAd, linkedHashSet, set);
                int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(linkedHashSet, 10));
                if (iFirebase < 16) {
                    iFirebase = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iFirebase);
                for (InterfaceC16902l interfaceC16902l2 : linkedHashSet) {
                    if (set == null || !set.contains(interfaceC16902l2)) {
                        Set set2 = c9188l.purchase;
                        abstractC4946lAdmob = C9912l.admob(interfaceC16902l2, c9188l, c2494l.m1175l(interfaceC16902l2, C9188l.yandex(c9188l, 0, false, set2 != null ? AbstractC9905l.admob(set2, interfaceC16902l) : Collections.singleton(interfaceC16902l), null, 47)));
                    } else {
                        abstractC4946lAdmob = AbstractC12008l.firebase(interfaceC16902l2, c9188l);
                    }
                    linkedHashMap2.put(interfaceC16902l2.metrica(), abstractC4946lAdmob);
                }
                C4344l c4344lM1200l = c2494l.m1200l(new C2201l(new C13105l(i, linkedHashMap2)), interfaceC16902l.getUpperBounds(), c9188l);
                if (c4344lM1200l.f8870l.isEmpty()) {
                    return c2494l.m1185l(c9188l);
                }
                if (c4344lM1200l.f8870l.f34966l == 1) {
                    return (AbstractC18041l) AbstractC16901l.m4223import(c4344lM1200l);
                }
                C8339l.metrica("Should only be one computed upper bound if no need to intersect all bounds");
                return null;
            case 12:
                return (AbstractC18041l) this.f33641l;
            case 13:
                return (UmaTrack) this.f33641l;
            case 14:
                ((InterfaceC11791l) this.f33641l).yandex();
                return Unit.INSTANCE;
            case 15:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException(th.getMessage());
                    }
                    ((C0462l) this.f33641l).ad(cancellationException);
                }
                return Unit.INSTANCE;
            case 16:
                long j = ((C9735l) obj).yandex;
                ((InterfaceC8714l) this.f33641l).setValue(new C17941l());
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return AbstractC16901l.m4218final((C7671l) this.f33641l, (List) obj);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list = (List) obj;
                Object objM4214continue = AbstractC16901l.m4214continue(list);
                C18046l c18046l = (C18046l) this.f33641l;
                return AbstractC8576l.yandex(objM4214continue, c18046l) ? list : AbstractC16901l.m4218final(c18046l, list);
            default:
                List list2 = (List) obj;
                Object objM4214continue2 = AbstractC16901l.m4214continue(list2);
                C5017l c5017l = (C5017l) this.f33641l;
                return AbstractC8576l.yandex(objM4214continue2, c5017l) ? list2 : AbstractC16901l.m4218final(c5017l, list2);
        }
    }

    public /* synthetic */ C17330l() {
        this.f33642l = 7;
    }
}

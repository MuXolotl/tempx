package defpackage;

import android.view.View;
import io.realm.kotlin.internal.interop.realm_query_arg_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٗۗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17344l {
    public static final char[] yandex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] loadAd = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static realm_value_t amazon(C3585l c3585l, Object obj) {
        if (obj == null) {
            return c3585l.signatures();
        }
        Map map = AbstractC16417l.yandex;
        Class<?> cls = obj.getClass();
        C2336l c2336l = AbstractC18202l.yandex;
        AbstractC14507l abstractC14507l = (AbstractC14507l) map.get(c2336l.loadAd(cls));
        if (abstractC14507l != null) {
            return abstractC14507l.crashlytics(c3585l, obj);
        }
        throw new IllegalArgumentException("Cannot use object '" + obj + "' of type '" + c2336l.loadAd(obj.getClass()).license() + "' as primary key argument");
    }

    public static final AbstractC9151l billing(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return new C4378l((InetSocketAddress) socketAddress);
        }
        if (socketAddress.getClass().getName().equals("java.net.UnixDomainSocketAddress")) {
            return new C10516l(socketAddress);
        }
        C8339l.smaato("Unknown socket address type");
        return null;
    }

    public static /* synthetic */ C3217l crashlytics(C12014l c12014l, Object obj, String str, C7695l c7695l, int i) {
        if ((i & 4) != 0) {
            c7695l = null;
        }
        return c12014l.m3309synchronized(obj, str, c7695l, null);
    }

    public static final InterfaceC3187l loadAd(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            InterfaceC3187l interfaceC3187l = tag instanceof InterfaceC3187l ? (InterfaceC3187l) tag : null;
            if (interfaceC3187l != null) {
                return interfaceC3187l;
            }
            Object objBilling = AbstractC6710l.billing(view);
            view = objBilling instanceof View ? (View) objBilling : null;
        }
        return null;
    }

    public static realm_value_t purchase(C3585l c3585l, Object obj) {
        C11140l c11140l = C11140l.f22375l;
        if (obj == null) {
            return c3585l.signatures();
        }
        try {
            C1332l c1332l = null;
            if (obj instanceof InterfaceC7457l) {
                C1332l c1332lSignature = ((InterfaceC2851l) ((InterfaceC9671l) obj)).getF36799l();
                c1332l = c1332lSignature != null ? c1332lSignature : null;
                if (c1332l != null) {
                    return c3585l.inmobi(c1332l);
                }
                throw new IllegalArgumentException("Cannot lookup unmanaged objects in realm");
            }
            if (!(obj instanceof InterfaceC3327l)) {
                Map map = AbstractC16417l.yandex;
                Class<?> cls = obj.getClass();
                C2336l c2336l = AbstractC18202l.yandex;
                AbstractC14507l abstractC14507l = (AbstractC14507l) map.get(c2336l.loadAd(cls));
                if (abstractC14507l != null) {
                    return abstractC14507l.crashlytics(c3585l, obj);
                }
                throw new IllegalArgumentException("Cannot convert primitive type '" + obj + "' of type '" + c2336l.loadAd(obj.getClass()).license() + "' as query argument");
            }
            InterfaceC3327l interfaceC3327l = (InterfaceC3327l) obj;
            switch (AbstractC5020l.inmobi(((C14076l) interfaceC3327l).yandex)) {
                case 10:
                    InterfaceC9671l interfaceC9671lSubs = ((C14076l) interfaceC3327l).subs(AbstractC18202l.yandex.loadAd(InterfaceC9671l.class));
                    if (interfaceC9671lSubs != null) {
                        C1332l c1332lSignature2 = ((InterfaceC2851l) interfaceC9671lSubs).getF36799l();
                        c1332l = c1332lSignature2 != null ? c1332lSignature2 : null;
                        if (c1332l == null) {
                            throw new IllegalArgumentException("Cannot lookup unmanaged objects in realm");
                        }
                    }
                    return c3585l.inmobi(c1332l);
                case 11:
                case 12:
                    throw new IllegalArgumentException("Cannot pass unmanaged collections as input argument");
                default:
                    switch (AbstractC5020l.inmobi(((C14076l) interfaceC3327l).yandex)) {
                        case 0:
                            return c3585l.isVip(Long.valueOf(((C14076l) interfaceC3327l).billing()));
                        case 1:
                            return c3585l.isPro(Boolean.valueOf(((C14076l) interfaceC3327l).yandex()));
                        case 2:
                            return c3585l.m1360volatile(((C14076l) interfaceC3327l).firebase());
                        case 3:
                            return c3585l.firebase(((C14076l) interfaceC3327l).loadAd());
                        case 4:
                            return c3585l.m1356native((C15729l) ((C14076l) interfaceC3327l).admob());
                        case 5:
                            return c3585l.subscription(Float.valueOf(((C14076l) interfaceC3327l).purchase()));
                        case 6:
                            return c3585l.startapp(Double.valueOf(((C14076l) interfaceC3327l).amazon()));
                        case 7:
                            return c3585l.remoteconfig(((C14076l) interfaceC3327l).crashlytics());
                        case 8:
                            return c11140l.metrica(((C14076l) interfaceC3327l).mopub().mopub());
                        case 9:
                            return c11140l.ads(((C4695l) ((C14076l) interfaceC3327l).isPro()).yandex);
                        default:
                            throw new UnsupportedOperationException("If you want to convert a 'RealmAny' instance containing an object to a 'RealmValue' use 'realmAnyToRealmValue' (when working with 'RealmQuery') or 'realmAnyToRealmValueWithObjectImport' (when using an accessor).");
                    }
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AbstractC14814l.startapp("Invalid query argument: ", e.getMessage()), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Throwable] */
    public static C12601l yandex(C3585l c3585l, Object[] objArr) {
        C12601l c12601l;
        int i;
        Object c10855l;
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i2 = 0;
        while (true) {
            C12601l c12601l2 = null;
            if (i2 >= length) {
                C10975l c10975l = (C10975l) c3585l.f7511l;
                int size = arrayList.size();
                int i3 = AbstractC9795l.yandex;
                long jNew_queryArgArray = realmcJNI.new_queryArgArray(size);
                realm_query_arg_t realm_query_arg_tVar = jNew_queryArgArray == 0 ? null : new realm_query_arg_t(jNew_queryArgArray, false);
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                int i4 = 0;
                for (Object obj : arrayList) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        ?? r18 = c12601l2;
                        AbstractC14055l.subscription();
                        throw r18;
                    }
                    InterfaceC18008l interfaceC18008l = (InterfaceC18008l) obj;
                    realm_query_arg_t realm_query_arg_tVar2 = new realm_query_arg_t(realmcJNI.new_realm_query_arg_t(), true);
                    if (interfaceC18008l instanceof C17892l) {
                        C17892l c17892l = (C17892l) interfaceC18008l;
                        C14785l c14785l = c17892l.yandex;
                        c12601l = c12601l2;
                        realmcJNI.realm_query_arg_t_nb_args_set(realm_query_arg_tVar2.yandex, realm_query_arg_tVar2, c14785l.f28908l);
                        realmcJNI.realm_query_arg_t_is_list_set(realm_query_arg_tVar2.yandex, realm_query_arg_tVar2, true);
                        realm_value_t realm_value_tVar = (realm_value_t) c14785l.f28907l;
                        realmcJNI.realm_query_arg_t_arg_set(realm_query_arg_tVar2.yandex, realm_query_arg_tVar2, realm_value_t.loadAd(realm_value_tVar), realm_value_tVar);
                        ((LinkedHashSet) c10975l.f22121l).add(c17892l);
                    } else {
                        c12601l = c12601l2;
                        if (!(interfaceC18008l instanceof C10855l)) {
                            C18725l.billing();
                            return c12601l;
                        }
                        realmcJNI.realm_query_arg_t_nb_args_set(realm_query_arg_tVar2.yandex, realm_query_arg_tVar2, 1L);
                        realmcJNI.realm_query_arg_t_is_list_set(realm_query_arg_tVar2.yandex, realm_query_arg_tVar2, false);
                        realm_value_t realm_value_tVar2 = ((C10855l) interfaceC18008l).yandex;
                        realmcJNI.realm_query_arg_t_arg_set(realm_query_arg_tVar2.yandex, realm_query_arg_tVar2, realm_value_t.loadAd(realm_value_tVar2), realm_value_tVar2);
                    }
                    realmcJNI.queryArgArray_setitem(realm_query_arg_t.yandex(realm_query_arg_tVar), realm_query_arg_tVar, i4, realm_query_arg_tVar2.yandex, realm_query_arg_tVar2);
                    arrayList2.add(Unit.INSTANCE);
                    i4 = i5;
                    c12601l2 = c12601l;
                }
                C12601l c12601l3 = new C12601l(arrayList.size(), realm_query_arg_tVar);
                ((LinkedHashSet) c10975l.f22121l).add(c12601l3);
                return c12601l3;
            }
            Object obj2 = objArr[i2];
            int i6 = 20;
            if (obj2 instanceof Collection) {
                int size2 = ((Collection) obj2).size();
                C14785l c14785l2 = new C14785l(size2, AbstractC9795l.crashlytics(size2), i6);
                Iterable iterable = (Iterable) obj2;
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(iterable, 10));
                int i7 = 0;
                for (Object obj3 : iterable) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        AbstractC14055l.subscription();
                        throw null;
                    }
                    realm_value_t realm_value_tVarPurchase = purchase(c3585l, obj3);
                    realm_value_t realm_value_tVar3 = (realm_value_t) c14785l2.f28907l;
                    int i9 = AbstractC9795l.yandex;
                    realmcJNI.valueArray_setitem(realm_value_tVar3.yandex, realm_value_tVar3, i7, realm_value_tVarPurchase.yandex, realm_value_tVarPurchase);
                    arrayList3.add(Unit.INSTANCE);
                    i7 = i8;
                    i2 = i2;
                }
                i = i2;
                c10855l = new C17892l(c14785l2);
            } else {
                i = i2;
                if (obj2 instanceof Iterable) {
                    List listAdcel = AbstractC17587l.adcel(AbstractC17587l.subs(((Iterable) obj2).iterator()));
                    int size3 = listAdcel.size();
                    C14785l c14785l3 = new C14785l(size3, AbstractC9795l.crashlytics(size3), i6);
                    ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(listAdcel, 10));
                    int i10 = 0;
                    for (Object obj4 : listAdcel) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            AbstractC14055l.subscription();
                            throw null;
                        }
                        realm_value_t realm_value_tVarPurchase2 = purchase(c3585l, obj4);
                        realm_value_t realm_value_tVar4 = (realm_value_t) c14785l3.f28907l;
                        int i12 = AbstractC9795l.yandex;
                        realmcJNI.valueArray_setitem(realm_value_tVar4.yandex, realm_value_tVar4, i10, realm_value_tVarPurchase2.yandex, realm_value_tVarPurchase2);
                        arrayList4.add(Unit.INSTANCE);
                        i10 = i11;
                    }
                    c10855l = new C17892l(c14785l3);
                } else {
                    c10855l = new C10855l(purchase(c3585l, obj2));
                }
            }
            arrayList.add(c10855l);
            i2 = i + 1;
        }
    }
}

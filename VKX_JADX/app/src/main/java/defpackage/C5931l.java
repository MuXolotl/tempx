package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_link_t;
import io.realm.kotlin.internal.interop.realm_query_arg_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘۙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5931l implements InterfaceC14426l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final LongPointerWrapper f12490l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC7832l f12491l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5501l f12492l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f12493l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC1388l f12494l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f12495l;

    public C5931l(C5501l c5501l, InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper, InterfaceC1388l interfaceC1388l, long j, int i) {
        this.f12495l = i;
        this.f12492l = c5501l;
        this.f12491l = interfaceC7832l;
        this.f12490l = longPointerWrapper;
        this.f12494l = interfaceC1388l;
        this.f12493l = j;
    }

    @Override // defpackage.InterfaceC14426l
    public final void ad(int i, Object obj, int i2, Map map) {
        int i3 = this.f12495l;
        LongPointerWrapper longPointerWrapper = this.f12490l;
        InterfaceC7832l interfaceC7832l = this.f12491l;
        C5501l c5501l = this.f12492l;
        switch (i3) {
            case 0:
                InterfaceC9671l interfaceC9671l = (InterfaceC9671l) obj;
                long j = i;
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i4 = AbstractC9795l.yandex;
                C2782l.isPro(AbstractC6710l.smaato(new LongPointerWrapper(realmcJNI.realm_list_insert_embedded(ptr$cinterop_release, j), false, 2, null), AbstractC18202l.yandex.loadAd(interfaceC9671l.getClass()), c5501l, interfaceC7832l), interfaceC9671l, i2, map);
                break;
            default:
                InterfaceC9671l interfaceC9671lYandex = (InterfaceC9671l) obj;
                C3585l c3585l = new C3585l(16);
                if (interfaceC9671lYandex != null) {
                    C1332l f36799l = ((InterfaceC2851l) interfaceC9671lYandex).getF36705l();
                    if (f36799l == null) {
                        interfaceC9671lYandex = AbstractC5661l.yandex(c5501l, interfaceC7832l.mo1846l(), interfaceC9671lYandex, i2, map);
                    } else if (!AbstractC8576l.yandex(f36799l.f3419l, interfaceC7832l)) {
                        C8339l.metrica("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                    }
                } else {
                    interfaceC9671lYandex = null;
                }
                realm_value_t realm_value_tVarInmobi = c3585l.inmobi(interfaceC9671lYandex != null ? ((InterfaceC2851l) interfaceC9671lYandex).getF36705l() : null);
                long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
                int i5 = AbstractC9795l.yandex;
                realmcJNI.realm_list_insert(ptr$cinterop_release2, i, realm_value_tVarInmobi.yandex, realm_value_tVarInmobi);
                Unit unit = Unit.INSTANCE;
                c3585l.tapsense();
                break;
        }
    }

    @Override // defpackage.InterfaceC14426l
    /* JADX INFO: renamed from: amazon, reason: merged with bridge method [inline-methods] */
    public final InterfaceC9671l get(int i) {
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = this.f12490l.getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_list_get(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
            return null;
        }
        return AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), this.f12494l, this.f12492l, this.f12491l);
    }

    @Override // defpackage.InterfaceC14426l
    public final boolean applovin(int i, Collection collection, int i2, Map map) {
        return AbstractC1757l.mopub(this, i, collection, i2, map);
    }

    @Override // defpackage.InterfaceC14426l
    public final boolean contains(Object obj) {
        return indexOf((InterfaceC9671l) obj) != -1;
    }

    @Override // defpackage.InterfaceC14426l
    public final int indexOf(Object obj) {
        InterfaceC9671l interfaceC9671l = (InterfaceC9671l) obj;
        if (interfaceC9671l != null && !AbstractC15011l.subs((InterfaceC2851l) interfaceC9671l)) {
            return -1;
        }
        C3585l c3585l = new C3585l(16);
        C1332l c1332l = null;
        if (interfaceC9671l != null) {
            C1332l f36799l = ((InterfaceC2851l) interfaceC9671l).getF36705l();
            c1332l = f36799l != null ? f36799l : null;
            if (c1332l == null) {
                C8339l.metrica("Cannot lookup unmanaged objects in realm");
                return 0;
            }
        }
        realm_value_t realm_value_tVarInmobi = c3585l.inmobi(c1332l);
        long[] jArr = new long[1];
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = this.f12490l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_list_find(ptr$cinterop_release, realm_value_tVarInmobi.yandex, realm_value_tVarInmobi, jArr, zArr);
        int i2 = (int) (zArr[0] ? jArr[0] : -1L);
        c3585l.tapsense();
        return i2;
    }

    @Override // defpackage.InterfaceC14426l
    public final InterfaceC14426l loadAd(InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper) {
        switch (this.f12495l) {
            case 0:
                return new C5931l(this.f12492l, interfaceC7832l, longPointerWrapper, this.f12494l, this.f12493l, 0);
            default:
                return new C5931l(this.f12492l, interfaceC7832l, longPointerWrapper, this.f12494l, this.f12493l, 1);
        }
    }

    @Override // defpackage.InterfaceC10984l
    public final InterfaceC7832l remoteconfig() {
        return this.f12491l;
    }

    @Override // defpackage.InterfaceC14426l
    public final boolean remove(Object obj) {
        return AbstractC1757l.advert(this, (InterfaceC9671l) obj);
    }

    @Override // defpackage.InterfaceC14426l
    /* JADX INFO: renamed from: strictfp */
    public final Object mo1566strictfp(int i, Object obj, int i2, LinkedHashMap linkedHashMap) {
        int i3 = this.f12495l;
        LongPointerWrapper longPointerWrapper = this.f12490l;
        InterfaceC7832l interfaceC7832l = this.f12491l;
        C5501l c5501l = this.f12492l;
        switch (i3) {
            case 0:
                InterfaceC9671l interfaceC9671l = (InterfaceC9671l) obj;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                realm_value_t realm_value_tVar = new realm_value_t();
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i4 = AbstractC9795l.yandex;
                realm_link_t realm_link_tVar = new realm_link_t(realmcJNI.realm_object_as_link(realmcJNI.realm_list_set_embedded(ptr$cinterop_release, i)), true);
                realm_value_tVar.mopub(10);
                realm_value_tVar.billing(realm_link_tVar);
                InterfaceC2851l interfaceC2851lIsPro = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) != 0 ? AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), this.f12494l, c5501l, interfaceC7832l) : null;
                C2782l.isPro(interfaceC2851lIsPro, interfaceC9671l, i2, linkedHashMap);
                for (Object obj2 : linkedHashSet) {
                    if (obj2 instanceof realm_value_t) {
                        realm_value_t realm_value_tVar2 = (realm_value_t) obj2;
                        int i5 = AbstractC9795l.yandex;
                        realmcJNI.realm_value_t_cleanup(realm_value_tVar2.yandex, realm_value_tVar2);
                    } else if (obj2 instanceof C12601l) {
                        realm_query_arg_t realm_query_arg_tVar = ((C12601l) obj2).loadAd;
                        int i6 = AbstractC9795l.yandex;
                        realmcJNI.delete_queryArgArray(realm_query_arg_t.yandex(realm_query_arg_tVar), realm_query_arg_tVar);
                    } else if (obj2 instanceof C17892l) {
                        realm_value_t realm_value_tVar3 = (realm_value_t) ((C17892l) obj2).yandex.f28907l;
                        realmcJNI.delete_valueArray(realm_value_t.loadAd(realm_value_tVar3), realm_value_tVar3);
                    }
                }
                return interfaceC2851lIsPro;
            default:
                InterfaceC9671l interfaceC9671lYandex = (InterfaceC9671l) obj;
                C3585l c3585l = new C3585l(16);
                if (interfaceC9671lYandex != null) {
                    C1332l f36799l = ((InterfaceC2851l) interfaceC9671lYandex).getF36705l();
                    if (f36799l == null) {
                        interfaceC9671lYandex = AbstractC5661l.yandex(c5501l, interfaceC7832l.mo1846l(), interfaceC9671lYandex, i2, linkedHashMap);
                    } else if (!AbstractC8576l.yandex(f36799l.f3419l, interfaceC7832l)) {
                        C8339l.metrica("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                        return null;
                    }
                } else {
                    interfaceC9671lYandex = null;
                }
                realm_value_t realm_value_tVarInmobi = c3585l.inmobi(interfaceC9671lYandex != null ? ((InterfaceC2851l) interfaceC9671lYandex).getF36705l() : null);
                InterfaceC9671l interfaceC9671l2 = get(i);
                long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
                int i7 = AbstractC9795l.yandex;
                realmcJNI.realm_list_set(ptr$cinterop_release2, i, realm_value_tVarInmobi.yandex, realm_value_tVarInmobi);
                c3585l.tapsense();
                return interfaceC9671l2;
        }
    }

    @Override // defpackage.InterfaceC14426l
    public final NativePointer yandex() {
        return this.f12490l;
    }
}

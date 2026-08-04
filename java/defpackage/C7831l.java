package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_link_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lًؙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7831l implements InterfaceC6429l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC14507l f16350l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f16351l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16352l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC7832l f16353l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5501l f16354l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC1388l f16355l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final LongPointerWrapper f16356l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final long f16357l;

    public C7831l(C5501l c5501l, InterfaceC7832l interfaceC7832l, AbstractC14507l abstractC14507l, LongPointerWrapper longPointerWrapper, InterfaceC1388l interfaceC1388l, long j, int i) {
        this.f16352l = i;
        this.f16354l = c5501l;
        this.f16353l = interfaceC7832l;
        this.f16350l = abstractC14507l;
        this.f16356l = longPointerWrapper;
        this.f16355l = interfaceC1388l;
        this.f16357l = j;
    }

    @Override // defpackage.InterfaceC6429l
    public final C8195l adcel(Object obj) {
        return AbstractC1757l.crashlytics(this, obj);
    }

    @Override // defpackage.InterfaceC6429l
    public final int admob() {
        return this.f16351l;
    }

    @Override // defpackage.InterfaceC6429l
    public final Object ads(NativePointer nativePointer, int i) {
        return AbstractC1757l.amazon(this, nativePointer, i);
    }

    @Override // defpackage.InterfaceC6429l
    public final C8195l appmetrica(Object obj, Object obj2, LinkedHashMap linkedHashMap) {
        return AbstractC1757l.billing(this, obj, (InterfaceC9671l) obj2, linkedHashMap);
    }

    @Override // defpackage.InterfaceC6429l
    public final void clear() {
        AbstractC1757l.yandex(this);
    }

    @Override // defpackage.InterfaceC6429l
    public final boolean containsKey(Object obj) {
        return AbstractC1757l.loadAd(this, obj);
    }

    @Override // defpackage.InterfaceC6429l
    public final boolean containsValue(Object obj) {
        InterfaceC9671l interfaceC9671l = (InterfaceC9671l) obj;
        this.f16353l.mo1844l();
        if (interfaceC9671l != null && !AbstractC15011l.subs((InterfaceC2851l) interfaceC9671l)) {
            return false;
        }
        C3585l c3585l = new C3585l(16);
        Map map = AbstractC16417l.yandex;
        C1332l c1332l = null;
        if (interfaceC9671l != null) {
            C1332l f36799l = ((InterfaceC2851l) interfaceC9671l).getF36705l();
            c1332l = f36799l != null ? f36799l : null;
            if (c1332l == null) {
                C8339l.metrica("Cannot lookup unmanaged objects in realm");
                return false;
            }
        }
        realm_value_t realm_value_tVarInmobi = c3585l.inmobi(c1332l);
        long[] jArr = new long[1];
        long ptr$cinterop_release = this.f16356l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_contains_value(ptr$cinterop_release, realm_value_tVarInmobi.yandex, realm_value_tVarInmobi, jArr);
        boolean z = jArr[0] != -1;
        c3585l.tapsense();
        return z;
    }

    @Override // defpackage.InterfaceC6429l
    public final void crashlytics(int i) {
        this.f16351l = i;
    }

    @Override // defpackage.InterfaceC6429l
    /* JADX INFO: renamed from: extends */
    public final AbstractC14507l mo792extends() {
        return this.f16350l;
    }

    @Override // defpackage.InterfaceC6429l
    public final Object get(Object obj) {
        InterfaceC7832l interfaceC7832l = this.f16353l;
        interfaceC7832l.mo1844l();
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarCrashlytics = this.f16350l.crashlytics(c3585l, obj);
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = this.f16356l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, realm_value_tVar.yandex, realm_value_tVar, new boolean[1]);
        InterfaceC2851l interfaceC2851lIsPro = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0 ? null : AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), this.f16355l, this.f16354l, interfaceC7832l);
        c3585l.tapsense();
        return interfaceC2851lIsPro;
    }

    @Override // defpackage.InterfaceC6429l
    public final Object inmobi(NativePointer nativePointer, int i) {
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_results_get(ptr$cinterop_release, i, realm_value_tVar.yandex, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
            return null;
        }
        return AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), this.f16355l, this.f16354l, this.f16353l);
    }

    @Override // defpackage.InterfaceC6429l
    public final C8195l isPro(Object obj, Object obj2, int i, Map map) {
        C8195l c8195l;
        int i2 = this.f16352l;
        InterfaceC1388l interfaceC1388l = this.f16355l;
        LongPointerWrapper longPointerWrapper = this.f16356l;
        InterfaceC7832l interfaceC7832l = this.f16353l;
        C5501l c5501l = this.f16354l;
        AbstractC14507l abstractC14507l = this.f16350l;
        switch (i2) {
            case 0:
                InterfaceC9671l interfaceC9671l = (InterfaceC9671l) obj2;
                C3585l c3585l = new C3585l(16);
                realm_value_t realm_value_tVarCrashlytics = abstractC14507l.crashlytics(c3585l, obj);
                if (interfaceC9671l == null) {
                    realm_value_t realm_value_tVarInmobi = c3585l.inmobi(null);
                    realm_value_t realm_value_tVar = new realm_value_t();
                    long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                    int i3 = AbstractC9795l.yandex;
                    realmcJNI.realm_dictionary_find(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, realm_value_tVar.yandex, realm_value_tVar, new boolean[1]);
                    boolean[] zArr = new boolean[1];
                    realmcJNI.realm_dictionary_insert(longPointerWrapper.getPtr$cinterop_release(), realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, realm_value_tVarInmobi.yandex, realm_value_tVarInmobi, new long[1], zArr);
                    c8195l = new C8195l(realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0 ? null : AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), interfaceC1388l, c5501l, interfaceC7832l), Boolean.valueOf(zArr[0]));
                } else {
                    realm_value_t realm_value_tVar2 = new realm_value_t();
                    long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
                    int i4 = AbstractC9795l.yandex;
                    realm_link_t realm_link_tVar = new realm_link_t(realmcJNI.realm_object_as_link(realmcJNI.realm_dictionary_insert_embedded(ptr$cinterop_release2, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics)), true);
                    realm_value_tVar2.mopub(10);
                    realm_value_tVar2.billing(realm_link_tVar);
                    InterfaceC2851l interfaceC2851lIsPro = realmcJNI.realm_value_t_type_get(realm_value_tVar2.yandex, realm_value_tVar2) == 0 ? null : AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar2), interfaceC1388l, c5501l, interfaceC7832l);
                    C2782l.isPro(interfaceC2851lIsPro, interfaceC9671l, i, map);
                    c8195l = new C8195l(interfaceC2851lIsPro, Boolean.TRUE);
                }
                c3585l.tapsense();
                return c8195l;
            default:
                InterfaceC9671l interfaceC9671lYandex = (InterfaceC9671l) obj2;
                C3585l c3585l2 = new C3585l(16);
                realm_value_t realm_value_tVarCrashlytics2 = abstractC14507l.crashlytics(c3585l2, obj);
                if (interfaceC9671lYandex != null) {
                    C1332l f36799l = ((InterfaceC2851l) interfaceC9671lYandex).getF36705l();
                    if (f36799l == null) {
                        interfaceC9671lYandex = AbstractC5661l.yandex(c5501l, interfaceC7832l.mo1846l(), interfaceC9671lYandex, i, map);
                    } else if (!AbstractC8576l.yandex(f36799l.f3419l, interfaceC7832l)) {
                        C8339l.metrica("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                        return null;
                    }
                } else {
                    interfaceC9671lYandex = null;
                }
                realm_value_t realm_value_tVarInmobi2 = c3585l2.inmobi(interfaceC9671lYandex != null ? ((InterfaceC2851l) interfaceC9671lYandex).getF36705l() : null);
                realm_value_t realm_value_tVar3 = new realm_value_t();
                long ptr$cinterop_release3 = longPointerWrapper.getPtr$cinterop_release();
                int i5 = AbstractC9795l.yandex;
                realmcJNI.realm_dictionary_find(ptr$cinterop_release3, realm_value_tVarCrashlytics2.yandex, realm_value_tVarCrashlytics2, realm_value_tVar3.yandex, realm_value_tVar3, new boolean[1]);
                boolean[] zArr2 = new boolean[1];
                realmcJNI.realm_dictionary_insert(longPointerWrapper.getPtr$cinterop_release(), realm_value_tVarCrashlytics2.yandex, realm_value_tVarCrashlytics2, realm_value_tVarInmobi2.yandex, realm_value_tVarInmobi2, new long[1], zArr2);
                C8195l c8195l2 = new C8195l(realmcJNI.realm_value_t_type_get(realm_value_tVar3.yandex, realm_value_tVar3) == 0 ? null : AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar3), interfaceC1388l, c5501l, interfaceC7832l), Boolean.valueOf(zArr2[0]));
                c3585l2.tapsense();
                return c8195l2;
        }
    }

    @Override // defpackage.InterfaceC6429l
    public final InterfaceC6429l loadAd(InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper) {
        return new C7831l(this.f16354l, interfaceC7832l, AbstractC16417l.yandex(AbstractC18202l.yandex.loadAd(String.class)), longPointerWrapper, this.f16355l, this.f16357l, 1);
    }

    @Override // defpackage.InterfaceC6429l
    public final C8195l metrica(int i) {
        InterfaceC7832l interfaceC7832l = this.f16353l;
        interfaceC7832l.mo1844l();
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_t realm_value_tVar2 = new realm_value_t();
        long ptr$cinterop_release = this.f16356l.getPtr$cinterop_release();
        long j = i;
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_get(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar, realm_value_tVar2.yandex, realm_value_tVar2);
        return new C8195l(this.f16350l.amazon(realm_value_tVar), realmcJNI.realm_value_t_type_get(realm_value_tVar2.yandex, realm_value_tVar2) == 0 ? null : AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar2), this.f16355l, this.f16354l, interfaceC7832l));
    }

    @Override // defpackage.InterfaceC6429l
    public final int mopub() {
        return AbstractC1757l.purchase(this);
    }

    @Override // defpackage.InterfaceC6429l
    /* JADX INFO: renamed from: native */
    public final void mo796native(InterfaceC2599l interfaceC2599l, int i, Map map) {
        AbstractC1757l.pro(this, interfaceC2599l, i, map);
    }

    @Override // defpackage.InterfaceC10984l
    public final InterfaceC7832l remoteconfig() {
        return this.f16353l;
    }

    @Override // defpackage.InterfaceC6429l
    public final Object remove(Object obj) {
        return (InterfaceC9671l) AbstractC1757l.ad(this, obj);
    }

    @Override // defpackage.InterfaceC6429l
    public final C8195l smaato(Object obj) {
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarCrashlytics = this.f16350l.crashlytics(c3585l, obj);
        realm_value_t realm_value_tVar = new realm_value_t();
        LongPointerWrapper longPointerWrapper = this.f16356l;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, realm_value_tVar.yandex, realm_value_tVar, new boolean[1]);
        boolean[] zArr = new boolean[1];
        realmcJNI.realm_dictionary_erase(longPointerWrapper.getPtr$cinterop_release(), realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, zArr);
        C8195l c8195l = new C8195l(realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0 ? null : AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), this.f16355l, this.f16354l, this.f16353l), Boolean.valueOf(zArr[0]));
        c3585l.tapsense();
        return c8195l;
    }

    @Override // defpackage.InterfaceC6429l
    public final Object vip(Object obj, Object obj2, int i, Map map) {
        return (InterfaceC9671l) AbstractC1757l.license(this, obj, (InterfaceC9671l) obj2, i, map);
    }

    @Override // defpackage.InterfaceC6429l
    /* JADX INFO: renamed from: volatile */
    public final boolean mo803volatile(Object obj, Object obj2) {
        return ((InterfaceC9671l) obj) == ((InterfaceC9671l) obj2);
    }

    @Override // defpackage.InterfaceC6429l
    public final NativePointer yandex() {
        return this.f16356l;
    }
}

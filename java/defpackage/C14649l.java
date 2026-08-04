package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_query_arg_t;
import io.realm.kotlin.internal.interop.realmcJNI;

/* JADX INFO: renamed from: lٕٔؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14649l implements InterfaceC2329l, InterfaceC14681l, InterfaceC13077l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC1388l f28661l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f28662l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC7832l f28663l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final LongPointerWrapper f28664l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C5501l f28665l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8688l f28666l;

    public C14649l(InterfaceC7832l interfaceC7832l, long j, InterfaceC1388l interfaceC1388l, C5501l c5501l, String str, Object[] objArr) {
        C3585l c3585l = new C3585l(16);
        C12601l c12601lYandex = AbstractC17344l.yandex(c3585l, objArr);
        try {
            long ptr$cinterop_release = ((LongPointerWrapper) interfaceC7832l.mo1845l()).getPtr$cinterop_release();
            long j2 = c12601lYandex.yandex;
            realm_query_arg_t realm_query_arg_tVar = c12601lYandex.loadAd;
            int i = AbstractC9795l.yandex;
            LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_query_parse(ptr$cinterop_release, j, str, j2, realm_query_arg_t.yandex(realm_query_arg_tVar), realm_query_arg_tVar), false, 2, null);
            c3585l.tapsense();
            this(j, interfaceC1388l, interfaceC7832l, c5501l, longPointerWrapper);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException(e.getMessage(), e.getCause());
        }
    }

    @Override // defpackage.InterfaceC14681l
    public final void amazon() {
        AbstractC15960l.crashlytics(crashlytics()).amazon();
    }

    public final C14649l billing(String str, Object... objArr) {
        C3585l c3585l = new C3585l(16);
        C12601l c12601lYandex = AbstractC17344l.yandex(c3585l, objArr);
        long ptr$cinterop_release = this.f28664l.getPtr$cinterop_release();
        long j = c12601lYandex.yandex;
        realm_query_arg_t realm_query_arg_tVar = c12601lYandex.loadAd;
        int i = AbstractC9795l.yandex;
        LongPointerWrapper longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_query_append_query(ptr$cinterop_release, str, j, realm_query_arg_t.yandex(realm_query_arg_tVar), realm_query_arg_tVar), false, 2, null);
        C14649l c14649l = new C14649l(this.f28662l, this.f28661l, this.f28663l, this.f28665l, longPointerWrapper);
        c3585l.tapsense();
        return c14649l;
    }

    public final C15825l crashlytics() {
        return new C15825l(this.f28663l, (NativePointer) this.f28666l.getValue(), this.f28662l, this.f28661l, this.f28665l);
    }

    public final C14649l loadAd(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("TRUEPREDICATE DISTINCT(".concat(str));
        for (String str2 : strArr) {
            sb.append(", " + str2);
        }
        sb.append(")");
        return billing(sb.toString(), new Object[0]);
    }

    public final C17483l purchase() {
        return new C17483l(this.f28662l, this.f28661l, this.f28663l, this.f28665l, this.f28664l);
    }

    @Override // defpackage.InterfaceC13077l
    public final InterfaceC2257l vip() {
        return new C0093l((NativePointer) this.f28666l.getValue(), this.f28662l, this.f28661l, this.f28665l);
    }

    public final C18338l yandex() {
        C18338l c18338l = new C18338l();
        c18338l.f35847l = this.f28663l;
        c18338l.f35846l = this.f28664l;
        c18338l.f35850l = this.f28665l;
        c18338l.f35848l = this.f28662l;
        c18338l.f35849l = this.f28661l;
        return c18338l;
    }

    public C14649l(long j, InterfaceC1388l interfaceC1388l, InterfaceC7832l interfaceC7832l, C5501l c5501l, LongPointerWrapper longPointerWrapper) {
        this.f28663l = interfaceC7832l;
        this.f28662l = j;
        this.f28661l = interfaceC1388l;
        this.f28665l = c5501l;
        this.f28664l = longPointerWrapper;
        this.f28666l = new C8688l(new C10740l(11, this));
        interfaceC7832l.mo1847l().loadAd(j);
    }
}

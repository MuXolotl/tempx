package defpackage;

import java.io.Serializable;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lّْٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C13325l implements Serializable {
    public static final C11633l Companion = new C11633l();

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final InterfaceC1220l[] f26140l = {null, null, AbstractC9968l.crashlytics(2, new C11200l(27)), null, null, null, null, null, null, AbstractC9968l.crashlytics(2, new C11200l(28))};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final EnumC3116l f26141l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f26142l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f26143l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f26144l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f26145l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Map f26146l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C8485l f26147l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Integer f26148l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f26149l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f26150l;

    public /* synthetic */ C13325l(int i, String str, String str2, EnumC3116l enumC3116l, Integer num, C8485l c8485l, String str3, String str4, boolean z, boolean z2, Map map) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C14344l.yandex.purchase());
            throw null;
        }
        this.f26145l = str;
        this.f26144l = str2;
        if ((i & 4) == 0) {
            this.f26141l = EnumC3116l.f6658l;
        } else {
            this.f26141l = enumC3116l;
        }
        if ((i & 8) == 0) {
            this.f26148l = null;
        } else {
            this.f26148l = num;
        }
        if ((i & 16) == 0) {
            this.f26147l = null;
        } else {
            this.f26147l = c8485l;
        }
        if ((i & 32) == 0) {
            this.f26150l = null;
        } else {
            this.f26150l = str3;
        }
        if ((i & 64) == 0) {
            this.f26142l = null;
        } else {
            this.f26142l = str4;
        }
        if ((i & 128) == 0) {
            this.f26143l = false;
        } else {
            this.f26143l = z;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.f26149l = false;
        } else {
            this.f26149l = z2;
        }
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.f26146l = C14054l.f27396l;
        } else {
            this.f26146l = map;
        }
    }

    public static C13325l yandex(C13325l c13325l, String str, String str2, int i) {
        String str3 = c13325l.f26145l;
        String str4 = c13325l.f26144l;
        EnumC3116l enumC3116l = c13325l.f26141l;
        Integer num = c13325l.f26148l;
        C8485l c8485l = c13325l.f26147l;
        if ((i & 32) != 0) {
            str = c13325l.f26150l;
        }
        String str5 = str;
        if ((i & 64) != 0) {
            str2 = c13325l.f26142l;
        }
        return new C13325l(str3, str4, enumC3116l, num, c8485l, str5, str2, c13325l.f26143l, c13325l.f26149l, c13325l.f26146l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13325l)) {
            return false;
        }
        C13325l c13325l = (C13325l) obj;
        return AbstractC8576l.yandex(this.f26145l, c13325l.f26145l) && AbstractC8576l.yandex(this.f26144l, c13325l.f26144l) && this.f26141l == c13325l.f26141l && AbstractC8576l.yandex(this.f26148l, c13325l.f26148l) && AbstractC8576l.yandex(this.f26147l, c13325l.f26147l) && AbstractC8576l.yandex(this.f26150l, c13325l.f26150l) && AbstractC8576l.yandex(this.f26142l, c13325l.f26142l) && this.f26143l == c13325l.f26143l && this.f26149l == c13325l.f26149l && AbstractC8576l.yandex(this.f26146l, c13325l.f26146l);
    }

    public final int hashCode() {
        int iHashCode = (this.f26141l.hashCode() + AbstractC12589l.advert(this.f26145l.hashCode() * 31, 31, this.f26144l)) * 31;
        Integer num = this.f26148l;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C8485l c8485l = this.f26147l;
        int iHashCode3 = (iHashCode2 + (c8485l == null ? 0 : c8485l.hashCode())) * 31;
        String str = this.f26150l;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26142l;
        return this.f26146l.hashCode() + ((((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f26143l ? 1231 : 1237)) * 31) + (this.f26149l ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Cookie(name=" + this.f26145l + ", value=" + this.f26144l + ", encoding=" + this.f26141l + ", maxAge=" + this.f26148l + ", expires=" + this.f26147l + ", domain=" + this.f26150l + ", path=" + this.f26142l + ", secure=" + this.f26143l + ", httpOnly=" + this.f26149l + ", extensions=" + this.f26146l + ')';
    }

    public C13325l(String str, String str2, EnumC3116l enumC3116l, Integer num, C8485l c8485l, String str3, String str4, boolean z, boolean z2, Map map) {
        this.f26145l = str;
        this.f26144l = str2;
        this.f26141l = enumC3116l;
        this.f26148l = num;
        this.f26147l = c8485l;
        this.f26150l = str3;
        this.f26142l = str4;
        this.f26143l = z;
        this.f26149l = z2;
        this.f26146l = map;
    }
}

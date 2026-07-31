package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَؒۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1512l extends AbstractC2597l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C1512l f3766l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C2630l f3767l = new C2630l(24);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public List f3768l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f3769l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C18128l f3770l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f3771l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC7735l f3772l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f3773l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f3774l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f3775l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f3776l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public List f3777l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C18128l f3778l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public List f3779l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public List f3780l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public byte f3781l;

    static {
        C1512l c1512l = new C1512l();
        f3766l = c1512l;
        c1512l.f3776l = 6;
        c1512l.f3775l = 0;
        List list = Collections.EMPTY_LIST;
        c1512l.f3779l = list;
        C18128l c18128l = C18128l.f35421l;
        c1512l.f3770l = c18128l;
        c1512l.f3771l = 0;
        c1512l.f3778l = c18128l;
        c1512l.f3773l = 0;
        c1512l.f3780l = list;
        c1512l.f3777l = list;
        c1512l.f3768l = list;
    }

    public C1512l(C1718l c1718l, C3429l c3429l) {
        this.f3781l = (byte) -1;
        this.f3774l = -1;
        this.f3776l = 6;
        boolean z = false;
        this.f3775l = 0;
        List list = Collections.EMPTY_LIST;
        this.f3779l = list;
        C18128l c18128l = C18128l.f35421l;
        this.f3770l = c18128l;
        this.f3771l = 0;
        this.f3778l = c18128l;
        this.f3773l = 0;
        this.f3780l = list;
        this.f3777l = list;
        this.f3768l = list;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    C7699l c7699lAds = null;
                    switch (iMetrica) {
                        case 0:
                            break;
                        case 8:
                            this.f3769l |= 1;
                            this.f3776l = c1718l.smaato();
                            continue;
                        case 16:
                            this.f3769l |= 2;
                            this.f3775l = c1718l.smaato();
                            continue;
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                            if ((i & 4) != 4) {
                                this.f3779l = new ArrayList();
                                i |= 4;
                            }
                            this.f3779l.add(c1718l.admob(C17586l.f34234l, c3429l));
                            continue;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                            if ((this.f3769l & 4) == 4) {
                                C18128l c18128l2 = this.f3770l;
                                c18128l2.getClass();
                                c7699lAds = C18128l.ads(c18128l2);
                            }
                            C18128l c18128l3 = (C18128l) c1718l.admob(C18128l.f35420l, c3429l);
                            this.f3770l = c18128l3;
                            if (c7699lAds != null) {
                                c7699lAds.isPro(c18128l3);
                                this.f3770l = c7699lAds.admob();
                            }
                            this.f3769l |= 4;
                            continue;
                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                            this.f3769l |= 8;
                            this.f3771l = c1718l.smaato();
                            continue;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            if ((this.f3769l & 16) == 16) {
                                C18128l c18128l4 = this.f3778l;
                                c18128l4.getClass();
                                c7699lAds = C18128l.ads(c18128l4);
                            }
                            C18128l c18128l5 = (C18128l) c1718l.admob(C18128l.f35420l, c3429l);
                            this.f3778l = c18128l5;
                            if (c7699lAds != null) {
                                c7699lAds.isPro(c18128l5);
                                this.f3778l = c7699lAds.admob();
                            }
                            this.f3769l |= 16;
                            continue;
                        case 56:
                            this.f3769l |= 32;
                            this.f3773l = c1718l.smaato();
                            continue;
                        case 66:
                            if ((i & 128) != 128) {
                                this.f3780l = new ArrayList();
                                i |= 128;
                            }
                            this.f3780l.add(c1718l.admob(C7899l.f16471l, c3429l));
                            continue;
                        case 248:
                            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                                this.f3777l = new ArrayList();
                                i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            }
                            this.f3777l.add(Integer.valueOf(c1718l.smaato()));
                            continue;
                        case 250:
                            int iPurchase = c1718l.purchase(c1718l.smaato());
                            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256 && c1718l.crashlytics() > 0) {
                                this.f3777l = new ArrayList();
                                i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            }
                            while (c1718l.crashlytics() > 0) {
                                this.f3777l.add(Integer.valueOf(c1718l.smaato()));
                            }
                            c1718l.amazon(iPurchase);
                            continue;
                        case 258:
                            if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
                                this.f3768l = new ArrayList();
                                i |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                            }
                            this.f3768l.add(c1718l.admob(C4987l.f10218l, c3429l));
                            continue;
                        default:
                            if (!vip(c1718l, c11522lM3096volatile, c3429l, iMetrica)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (C12383l e) {
                    e.f24472l = this;
                    throw e;
                } catch (IOException e2) {
                    C12383l c12383l = new C12383l(e2.getMessage());
                    c12383l.f24472l = this;
                    throw c12383l;
                }
            } catch (Throwable th) {
                if ((i & 4) == 4) {
                    this.f3779l = DesugarCollections.unmodifiableList(this.f3779l);
                }
                if ((i & 128) == 128) {
                    this.f3780l = DesugarCollections.unmodifiableList(this.f3780l);
                }
                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.f3777l = DesugarCollections.unmodifiableList(this.f3777l);
                }
                if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
                    this.f3768l = DesugarCollections.unmodifiableList(this.f3768l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f3772l = c6769l.mopub();
                }
                remoteconfig();
                throw th;
            }
        }
        if ((i & 4) == 4) {
            this.f3779l = DesugarCollections.unmodifiableList(this.f3779l);
        }
        if ((i & 128) == 128) {
            this.f3780l = DesugarCollections.unmodifiableList(this.f3780l);
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.f3777l = DesugarCollections.unmodifiableList(this.f3777l);
        }
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            this.f3768l = DesugarCollections.unmodifiableList(this.f3768l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f3772l = c6769l.mopub();
        }
        remoteconfig();
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C5622l.subs();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        C10023l c10023l = new C10023l(this);
        if ((this.f3769l & 1) == 1) {
            c11522l.m3097abstract(1, this.f3776l);
        }
        if ((this.f3769l & 2) == 2) {
            c11522l.m3097abstract(2, this.f3775l);
        }
        for (int i = 0; i < this.f3779l.size(); i++) {
            c11522l.m3120public(3, (AbstractC14080l) this.f3779l.get(i));
        }
        if ((this.f3769l & 4) == 4) {
            c11522l.m3120public(4, this.f3770l);
        }
        if ((this.f3769l & 8) == 8) {
            c11522l.m3097abstract(5, this.f3771l);
        }
        if ((this.f3769l & 16) == 16) {
            c11522l.m3120public(6, this.f3778l);
        }
        if ((this.f3769l & 32) == 32) {
            c11522l.m3097abstract(7, this.f3773l);
        }
        for (int i2 = 0; i2 < this.f3780l.size(); i2++) {
            c11522l.m3120public(8, (AbstractC14080l) this.f3780l.get(i2));
        }
        for (int i3 = 0; i3 < this.f3777l.size(); i3++) {
            c11522l.m3097abstract(31, ((Integer) this.f3777l.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.f3768l.size(); i4++) {
            c11522l.m3120public(32, (AbstractC14080l) this.f3768l.get(i4));
        }
        c10023l.m2827for(200, c11522l);
        c11522l.m3129try(this.f3772l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        List list;
        int i = this.f3774l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f3769l & 1) == 1 ? C11522l.vip(1, this.f3776l) : 0;
        if ((this.f3769l & 2) == 2) {
            iVip += C11522l.vip(2, this.f3775l);
        }
        for (int i2 = 0; i2 < this.f3779l.size(); i2++) {
            iVip += C11522l.startapp(3, (AbstractC14080l) this.f3779l.get(i2));
        }
        if ((this.f3769l & 4) == 4) {
            iVip += C11522l.startapp(4, this.f3770l);
        }
        if ((this.f3769l & 8) == 8) {
            iVip += C11522l.vip(5, this.f3771l);
        }
        if ((this.f3769l & 16) == 16) {
            iVip += C11522l.startapp(6, this.f3778l);
        }
        if ((this.f3769l & 32) == 32) {
            iVip += C11522l.vip(7, this.f3773l);
        }
        for (int i3 = 0; i3 < this.f3780l.size(); i3++) {
            iVip += C11522l.startapp(8, (AbstractC14080l) this.f3780l.get(i3));
        }
        int i4 = 0;
        int iMetrica = 0;
        while (true) {
            int size = this.f3777l.size();
            list = this.f3777l;
            if (i4 >= size) {
                break;
            }
            iMetrica += C11522l.metrica(((Integer) list.get(i4)).intValue());
            i4++;
        }
        int size2 = (list.size() * 2) + iVip + iMetrica;
        for (int i5 = 0; i5 < this.f3768l.size(); i5++) {
            size2 += C11522l.startapp(32, (AbstractC14080l) this.f3768l.get(i5));
        }
        int size3 = this.f3772l.size() + isPro() + size2;
        this.f3774l = size3;
        return size3;
    }

    @Override // defpackage.InterfaceC8988l
    public final AbstractC14080l loadAd() {
        return f3766l;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C5622l c5622lSubs = C5622l.subs();
        c5622lSubs.isPro(this);
        return c5622lSubs;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f3781l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f3769l & 2) != 2) {
            this.f3781l = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f3779l.size(); i++) {
            if (!((C17586l) this.f3779l.get(i)).yandex()) {
                this.f3781l = (byte) 0;
                return false;
            }
        }
        if ((this.f3769l & 4) == 4 && !this.f3770l.yandex()) {
            this.f3781l = (byte) 0;
            return false;
        }
        if ((this.f3769l & 16) == 16 && !this.f3778l.yandex()) {
            this.f3781l = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f3780l.size(); i2++) {
            if (!((C7899l) this.f3780l.get(i2)).yandex()) {
                this.f3781l = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f3768l.size(); i3++) {
            if (!((C4987l) this.f3768l.get(i3)).yandex()) {
                this.f3781l = (byte) 0;
                return false;
            }
        }
        if (subs()) {
            this.f3781l = (byte) 1;
            return true;
        }
        this.f3781l = (byte) 0;
        return false;
    }

    public C1512l() {
        this.f3781l = (byte) -1;
        this.f3774l = -1;
        this.f3772l = AbstractC7735l.f16231l;
    }

    public C1512l(C5622l c5622l) {
        super(c5622l);
        this.f3781l = (byte) -1;
        this.f3774l = -1;
        this.f3772l = c5622l.f5168l;
    }
}

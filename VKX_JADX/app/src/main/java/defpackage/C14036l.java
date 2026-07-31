package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌۣٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14036l extends AbstractC2597l {

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final C14036l f27354l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final C2630l f27355l = new C2630l(15);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public List f27356l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public List f27357l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f27358l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C18128l f27359l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public List f27360l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public List f27361l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f27362l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public List f27363l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public int f27364l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC7735l f27365l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C15743l f27366l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C3647l f27367l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C18128l f27368l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public List f27369l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f27370l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f27371l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public List f27372l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public List f27373l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f27374l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f27375l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f27376l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public List f27377l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public byte f27378l;

    static {
        C14036l c14036l = new C14036l();
        f27354l = c14036l;
        c14036l.startapp();
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public C14036l(defpackage.C1718l r21, defpackage.C3429l r22) {
        /*
            Method dump skipped, instruction units count: 1116
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14036l.<init>(lٌٌؓ, lٖۣؕ):void");
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C14316l.subs();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        C10023l c10023l = new C10023l(this);
        if ((this.f27358l & 2) == 2) {
            c11522l.m3097abstract(1, this.f27370l);
        }
        if ((this.f27358l & 4) == 4) {
            c11522l.m3097abstract(2, this.f27374l);
        }
        if ((this.f27358l & 8) == 8) {
            c11522l.m3120public(3, this.f27359l);
        }
        for (int i = 0; i < this.f27373l.size(); i++) {
            c11522l.m3120public(4, (AbstractC14080l) this.f27373l.get(i));
        }
        if ((this.f27358l & 32) == 32) {
            c11522l.m3120public(5, this.f27368l);
        }
        for (int i2 = 0; i2 < this.f27363l.size(); i2++) {
            c11522l.m3120public(6, (AbstractC14080l) this.f27363l.get(i2));
        }
        if ((this.f27358l & 16) == 16) {
            c11522l.m3097abstract(7, this.f27362l);
        }
        if ((this.f27358l & 64) == 64) {
            c11522l.m3097abstract(8, this.f27375l);
        }
        if ((this.f27358l & 1) == 1) {
            c11522l.m3097abstract(9, this.f27371l);
        }
        for (int i3 = 0; i3 < this.f27372l.size(); i3++) {
            c11522l.m3120public(10, (AbstractC14080l) this.f27372l.get(i3));
        }
        if (this.f27357l.size() > 0) {
            c11522l.m3130while(90);
            c11522l.m3130while(this.f27376l);
        }
        for (int i4 = 0; i4 < this.f27357l.size(); i4++) {
            c11522l.m3113instanceof(((Integer) this.f27357l.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.f27360l.size(); i5++) {
            c11522l.m3120public(12, (AbstractC14080l) this.f27360l.get(i5));
        }
        for (int i6 = 0; i6 < this.f27369l.size(); i6++) {
            c11522l.m3120public(13, (AbstractC14080l) this.f27369l.get(i6));
        }
        if ((this.f27358l & 128) == 128) {
            c11522l.m3120public(30, this.f27367l);
        }
        for (int i7 = 0; i7 < this.f27377l.size(); i7++) {
            c11522l.m3097abstract(31, ((Integer) this.f27377l.get(i7)).intValue());
        }
        if ((this.f27358l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            c11522l.m3120public(32, this.f27366l);
        }
        for (int i8 = 0; i8 < this.f27361l.size(); i8++) {
            c11522l.m3120public(33, (AbstractC14080l) this.f27361l.get(i8));
        }
        for (int i9 = 0; i9 < this.f27356l.size(); i9++) {
            c11522l.m3120public(34, (AbstractC14080l) this.f27356l.get(i9));
        }
        c10023l.m2827for(19000, c11522l);
        c11522l.m3129try(this.f27365l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        List list;
        List list2;
        int i = this.f27364l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f27358l & 2) == 2 ? C11522l.vip(1, this.f27370l) : 0;
        if ((this.f27358l & 4) == 4) {
            iVip += C11522l.vip(2, this.f27374l);
        }
        if ((this.f27358l & 8) == 8) {
            iVip += C11522l.startapp(3, this.f27359l);
        }
        for (int i2 = 0; i2 < this.f27373l.size(); i2++) {
            iVip += C11522l.startapp(4, (AbstractC14080l) this.f27373l.get(i2));
        }
        if ((this.f27358l & 32) == 32) {
            iVip += C11522l.startapp(5, this.f27368l);
        }
        for (int i3 = 0; i3 < this.f27363l.size(); i3++) {
            iVip += C11522l.startapp(6, (AbstractC14080l) this.f27363l.get(i3));
        }
        if ((this.f27358l & 16) == 16) {
            iVip += C11522l.vip(7, this.f27362l);
        }
        if ((this.f27358l & 64) == 64) {
            iVip += C11522l.vip(8, this.f27375l);
        }
        if ((this.f27358l & 1) == 1) {
            iVip += C11522l.vip(9, this.f27371l);
        }
        for (int i4 = 0; i4 < this.f27372l.size(); i4++) {
            iVip += C11522l.startapp(10, (AbstractC14080l) this.f27372l.get(i4));
        }
        int i5 = 0;
        int iMetrica = 0;
        while (true) {
            int size = this.f27357l.size();
            list = this.f27357l;
            if (i5 >= size) {
                break;
            }
            iMetrica += C11522l.metrica(((Integer) list.get(i5)).intValue());
            i5++;
        }
        int iStartapp = iVip + iMetrica;
        if (!list.isEmpty()) {
            iStartapp = iStartapp + 1 + C11522l.metrica(iMetrica);
        }
        this.f27376l = iMetrica;
        for (int i6 = 0; i6 < this.f27360l.size(); i6++) {
            iStartapp += C11522l.startapp(12, (AbstractC14080l) this.f27360l.get(i6));
        }
        for (int i7 = 0; i7 < this.f27369l.size(); i7++) {
            iStartapp += C11522l.startapp(13, (AbstractC14080l) this.f27369l.get(i7));
        }
        if ((this.f27358l & 128) == 128) {
            iStartapp += C11522l.startapp(30, this.f27367l);
        }
        int i8 = 0;
        int iMetrica2 = 0;
        while (true) {
            int size2 = this.f27377l.size();
            list2 = this.f27377l;
            if (i8 >= size2) {
                break;
            }
            iMetrica2 += C11522l.metrica(((Integer) list2.get(i8)).intValue());
            i8++;
        }
        int size3 = (list2.size() * 2) + iStartapp + iMetrica2;
        if ((this.f27358l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            size3 += C11522l.startapp(32, this.f27366l);
        }
        for (int i9 = 0; i9 < this.f27361l.size(); i9++) {
            size3 += C11522l.startapp(33, (AbstractC14080l) this.f27361l.get(i9));
        }
        for (int i10 = 0; i10 < this.f27356l.size(); i10++) {
            size3 += C11522l.startapp(34, (AbstractC14080l) this.f27356l.get(i10));
        }
        int size4 = this.f27365l.size() + isPro() + size3;
        this.f27364l = size4;
        return size4;
    }

    @Override // defpackage.InterfaceC8988l
    public final AbstractC14080l loadAd() {
        return f27354l;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C14316l c14316lSubs = C14316l.subs();
        c14316lSubs.isPro(this);
        return c14316lSubs;
    }

    public final void startapp() {
        this.f27371l = 6;
        this.f27370l = 6;
        this.f27374l = 0;
        C18128l c18128l = C18128l.f35421l;
        this.f27359l = c18128l;
        this.f27362l = 0;
        List list = Collections.EMPTY_LIST;
        this.f27373l = list;
        this.f27368l = c18128l;
        this.f27375l = 0;
        this.f27372l = list;
        this.f27357l = list;
        this.f27369l = list;
        this.f27363l = list;
        this.f27367l = C3647l.f7625l;
        this.f27377l = list;
        this.f27366l = C15743l.f30919l;
        this.f27361l = list;
        this.f27360l = list;
        this.f27356l = list;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f27378l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f27358l;
        if ((i & 4) != 4) {
            this.f27378l = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.f27359l.yandex()) {
            this.f27378l = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f27373l.size(); i2++) {
            if (!((C17586l) this.f27373l.get(i2)).yandex()) {
                this.f27378l = (byte) 0;
                return false;
            }
        }
        if ((this.f27358l & 32) == 32 && !this.f27368l.yandex()) {
            this.f27378l = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.f27372l.size(); i3++) {
            if (!((C18128l) this.f27372l.get(i3)).yandex()) {
                this.f27378l = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f27369l.size(); i4++) {
            if (!((C18426l) this.f27369l.get(i4)).yandex()) {
                this.f27378l = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.f27363l.size(); i5++) {
            if (!((C18426l) this.f27363l.get(i5)).yandex()) {
                this.f27378l = (byte) 0;
                return false;
            }
        }
        if ((this.f27358l & 128) == 128 && !this.f27367l.yandex()) {
            this.f27378l = (byte) 0;
            return false;
        }
        if ((this.f27358l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 && !this.f27366l.yandex()) {
            this.f27378l = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.f27361l.size(); i6++) {
            if (!((C4987l) this.f27361l.get(i6)).yandex()) {
                this.f27378l = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.f27360l.size(); i7++) {
            if (!((C7899l) this.f27360l.get(i7)).yandex()) {
                this.f27378l = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f27356l.size(); i8++) {
            if (!((C7899l) this.f27356l.get(i8)).yandex()) {
                this.f27378l = (byte) 0;
                return false;
            }
        }
        if (subs()) {
            this.f27378l = (byte) 1;
            return true;
        }
        this.f27378l = (byte) 0;
        return false;
    }

    public C14036l() {
        this.f27376l = -1;
        this.f27378l = (byte) -1;
        this.f27364l = -1;
        this.f27365l = AbstractC7735l.f16231l;
    }

    public C14036l(C14316l c14316l) {
        super(c14316l);
        this.f27376l = -1;
        this.f27378l = (byte) -1;
        this.f27364l = -1;
        this.f27365l = c14316l.f5168l;
    }
}

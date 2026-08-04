package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lِٕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11562l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f23236l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f23237l;

    public C11562l() {
        super(0);
        this.f23236l = AbstractC8020l.smaato(Boolean.FALSE);
        this.f23237l = AbstractC8020l.smaato("");
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final Unit m3134abstract(AbstractC14237l abstractC14237l, EnumC11781l enumC11781l, String str, C8487l c8487l, String str2) {
        if (abstractC14237l instanceof C10898l) {
            C7906l c7906l = (C7906l) ((C10898l) abstractC14237l).yandex;
            m4125private(new C16854l(str2, str, true, new C5779l(enumC11781l, c7906l.crashlytics, c7906l.amazon)));
        } else {
            if (!(abstractC14237l instanceof C17922l)) {
                C18725l.billing();
                return null;
            }
            if (AbstractC8576l.yandex(c8487l.loadAd, Boolean.TRUE)) {
                m4125private(new C16854l(str2, str, true, new C5779l(EnumC11781l.PASSWORD, 0, "")));
            } else {
                StringBuilder sb = new StringBuilder("[ES/");
                C17922l c17922l = (C17922l) abstractC14237l;
                sb.append(c17922l.yandex);
                sb.append("] ");
                sb.append(c17922l.loadAd);
                this.f23237l.setValue(sb.toString());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0120, code lost:
    
        if (r13.m3134abstract((defpackage.AbstractC14237l) r4, r15, r16, r17, r18) == r11) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015b, code lost:
    
        if (r13.m3134abstract((defpackage.AbstractC14237l) r4, r15, r16, r17, r18) == r11) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0194, code lost:
    
        if (r13.m3134abstract((defpackage.AbstractC14237l) r4, r15, r16, r17, r18) == r11) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cc, code lost:
    
        if (r13.m3134abstract((defpackage.AbstractC14237l) r4, r15, r16, r17, r18) == r11) goto L78;
     */
    /* JADX INFO: renamed from: import, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3135import(defpackage.C8366l r20, defpackage.C8487l r21, java.lang.String r22, defpackage.AbstractC0283l r23) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11562l.m3135import(lًۣۘ, lٌؑۖ, java.lang.String, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-161513018);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        byte b = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C10178l c10178lMopub = AbstractC11173l.mopub(null, c6956l, 3);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                C6523l c6523l = C6523l.loadAd;
                objM2132native = C7122l.yandex;
                c6956l.m2147try(objM2132native);
            }
            ((C7122l) objM2132native).getClass();
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(1215119746, new C1321l(this, b, b), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(523804951, new Cprotected(c10178lMopub, this, new C6523l(), 16), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1321l(this, i);
        }
    }
}

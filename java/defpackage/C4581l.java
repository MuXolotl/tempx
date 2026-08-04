package defpackage;

import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4581l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public byte f9298l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Inflater f9299l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public CRC32 f9300l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public /* synthetic */ Object f9301l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9302l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C9987l f9303l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f9304l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public ByteBuffer f9305l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public byte f9306l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C9987l f9307l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public ByteBuffer f9308l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public short f9309l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f9310l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9354l f9311l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4581l(boolean z, InterfaceC9354l interfaceC9354l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f9302l = z;
        this.f9311l = interfaceC9354l;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01ca A[Catch: all -> 0x0029, TryCatch #3 {all -> 0x0029, blocks: (B:7:0x0022, B:94:0x027b, B:96:0x0283, B:99:0x028a, B:100:0x0291, B:101:0x0292, B:89:0x025b, B:91:0x0261, B:103:0x02a6, B:105:0x02ae, B:107:0x02ce, B:110:0x02d3, B:111:0x02f7, B:112:0x02f8, B:113:0x02ff, B:114:0x0300, B:115:0x0323, B:116:0x0324, B:120:0x0338, B:121:0x033f, B:73:0x01fd, B:75:0x0203, B:77:0x0209, B:85:0x024c, B:65:0x01c4, B:67:0x01ca, B:70:0x01e3, B:72:0x01eb, B:86:0x0251, B:88:0x0257, B:122:0x0340, B:64:0x01bf), top: B:133:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e3 A[Catch: all -> 0x0029, PHI: r2 r4 r9 r10 r11 r12
  0x01e3: PHI (r2v32 lٍۨۦ) = (r2v31 lٍۨۦ), (r2v33 lٍۨۦ) binds: [B:18:0x0056, B:68:0x01df] A[DONT_GENERATE, DONT_INLINE]
  0x01e3: PHI (r4v13 java.lang.Object) = (r4v12 java.lang.Object), (r4v20 java.lang.Object) binds: [B:18:0x0056, B:68:0x01df] A[DONT_GENERATE, DONT_INLINE]
  0x01e3: PHI (r9v18 java.util.zip.Inflater) = (r9v17 java.util.zip.Inflater), (r9v19 java.util.zip.Inflater) binds: [B:18:0x0056, B:68:0x01df] A[DONT_GENERATE, DONT_INLINE]
  0x01e3: PHI (r10v18 java.nio.ByteBuffer) = (r10v17 java.nio.ByteBuffer), (r10v19 java.nio.ByteBuffer) binds: [B:18:0x0056, B:68:0x01df] A[DONT_GENERATE, DONT_INLINE]
  0x01e3: PHI (r11v22 java.nio.ByteBuffer) = (r11v21 java.nio.ByteBuffer), (r11v23 java.nio.ByteBuffer) binds: [B:18:0x0056, B:68:0x01df] A[DONT_GENERATE, DONT_INLINE]
  0x01e3: PHI (r12v12 java.util.zip.CRC32) = (r12v11 java.util.zip.CRC32), (r12v13 java.util.zip.CRC32) binds: [B:18:0x0056, B:68:0x01df] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x0029, blocks: (B:7:0x0022, B:94:0x027b, B:96:0x0283, B:99:0x028a, B:100:0x0291, B:101:0x0292, B:89:0x025b, B:91:0x0261, B:103:0x02a6, B:105:0x02ae, B:107:0x02ce, B:110:0x02d3, B:111:0x02f7, B:112:0x02f8, B:113:0x02ff, B:114:0x0300, B:115:0x0323, B:116:0x0324, B:120:0x0338, B:121:0x033f, B:73:0x01fd, B:75:0x0203, B:77:0x0209, B:85:0x024c, B:65:0x01c4, B:67:0x01ca, B:70:0x01e3, B:72:0x01eb, B:86:0x0251, B:88:0x0257, B:122:0x0340, B:64:0x01bf), top: B:133:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01eb A[Catch: all -> 0x0029, TryCatch #3 {all -> 0x0029, blocks: (B:7:0x0022, B:94:0x027b, B:96:0x0283, B:99:0x028a, B:100:0x0291, B:101:0x0292, B:89:0x025b, B:91:0x0261, B:103:0x02a6, B:105:0x02ae, B:107:0x02ce, B:110:0x02d3, B:111:0x02f7, B:112:0x02f8, B:113:0x02ff, B:114:0x0300, B:115:0x0323, B:116:0x0324, B:120:0x0338, B:121:0x033f, B:73:0x01fd, B:75:0x0203, B:77:0x0209, B:85:0x024c, B:65:0x01c4, B:67:0x01ca, B:70:0x01e3, B:72:0x01eb, B:86:0x0251, B:88:0x0257, B:122:0x0340, B:64:0x01bf), top: B:133:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0203 A[Catch: all -> 0x0029, TryCatch #3 {all -> 0x0029, blocks: (B:7:0x0022, B:94:0x027b, B:96:0x0283, B:99:0x028a, B:100:0x0291, B:101:0x0292, B:89:0x025b, B:91:0x0261, B:103:0x02a6, B:105:0x02ae, B:107:0x02ce, B:110:0x02d3, B:111:0x02f7, B:112:0x02f8, B:113:0x02ff, B:114:0x0300, B:115:0x0323, B:116:0x0324, B:120:0x0338, B:121:0x033f, B:73:0x01fd, B:75:0x0203, B:77:0x0209, B:85:0x024c, B:65:0x01c4, B:67:0x01ca, B:70:0x01e3, B:72:0x01eb, B:86:0x0251, B:88:0x0257, B:122:0x0340, B:64:0x01bf), top: B:133:0x000f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01e9 -> B:65:0x01c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01eb -> B:73:0x01fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0227 -> B:131:0x022d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0278 -> B:94:0x027b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4581l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C4581l c4581l = new C4581l(this.f9302l, this.f9311l, interfaceC14029l);
        c4581l.f9301l = obj;
        return c4581l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4581l) ads((InterfaceC14029l) obj2, (C16144l) obj)).Signature(Unit.INSTANCE);
    }
}

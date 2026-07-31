package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lَؘۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10118l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f20602l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f20603l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f20604l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f20605l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f20606l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10118l(C11969l c11969l, Function1 function1, long j, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f20604l = 5;
        this.f20603l = c11969l;
        this.f20605l = function1;
        this.f20602l = j;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0170  */
    /* JADX WARN: Code duplicated, block: B:79:0x0188  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0188 -> B:80:0x018b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10118l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f20604l;
        Object obj2 = this.f20605l;
        switch (i) {
            case 0:
                return new C10118l((AudioPlaylist) obj2, interfaceC14029l);
            case 1:
                C10118l c10118l = new C10118l(this.f20602l, (C15202l) obj2, interfaceC14029l);
                c10118l.f20603l = obj;
                return c10118l;
            case 2:
                C10118l c10118l2 = new C10118l((C1141l) obj2, this.f20602l, interfaceC14029l);
                c10118l2.f20603l = obj;
                return c10118l2;
            case 3:
                return new C10118l((C7119l) this.f20603l, this.f20602l, (C12014l) obj2, interfaceC14029l, 3);
            case 4:
                return new C10118l((C10294l) this.f20603l, this.f20602l, (C12515l) obj2, interfaceC14029l, 4);
            default:
                return new C10118l((C11969l) this.f20603l, (Function1) obj2, this.f20602l, interfaceC14029l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f20604l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((C10118l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10118l(C1141l c1141l, long j, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f20604l = 2;
        this.f20605l = c1141l;
        this.f20602l = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10118l(long j, C15202l c15202l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f20604l = 1;
        this.f20602l = j;
        this.f20605l = c15202l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10118l(Object obj, long j, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f20604l = i;
        this.f20603l = obj;
        this.f20602l = j;
        this.f20605l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10118l(AudioPlaylist audioPlaylist, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f20604l = 0;
        this.f20605l = audioPlaylist;
    }
}

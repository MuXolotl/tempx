package defpackage;

import android.content.Intent;
import androidx.car.app.navigation.model.Maneuver;
import androidx.glance.session.SessionWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.activity.ShortcutBridgeActivity;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lؚْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7226l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f15057l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f15058l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f15059l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f15060l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7226l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f15059l = i;
        this.f15057l = obj;
        this.f15058l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:510:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.recyclerview.widget.subs] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0070 -> B:20:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:510:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 2458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7226l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f15059l) {
            case 0:
                return new C7226l((C7864l) this.f15057l, (InterfaceC7702l) this.f15058l, interfaceC14029l, 0);
            case 1:
                C7226l c7226l = new C7226l((C7864l) this.f15057l, interfaceC14029l);
                c7226l.f15058l = obj;
                return c7226l;
            case 2:
                return new C7226l((C0071l) this.f15057l, (InterfaceC7702l) this.f15058l, interfaceC14029l, 2);
            case 3:
                C7226l c7226l2 = new C7226l((C0071l) this.f15058l, interfaceC14029l, 3);
                c7226l2.f15057l = obj;
                return c7226l2;
            case 4:
                C7226l c7226l3 = new C7226l((PlaybackService) this.f15058l, interfaceC14029l, 4);
                c7226l3.f15057l = obj;
                return c7226l3;
            case 5:
                return new C7226l((PlaybackService) this.f15057l, (Intent) this.f15058l, interfaceC14029l, 5);
            case 6:
                return new C7226l((C4261l) this.f15057l, (InterfaceC12244l) this.f15058l, interfaceC14029l, 6);
            case 7:
                C7226l c7226l4 = new C7226l((C2182l) this.f15058l, interfaceC14029l, 7);
                c7226l4.f15057l = obj;
                return c7226l4;
            case 8:
                return new C7226l((C1424l) this.f15057l, this.f15058l, interfaceC14029l, 8);
            case 9:
                return new C7226l((Function2) this.f15057l, (C9455l) this.f15058l, interfaceC14029l, 9);
            case 10:
                return new C7226l((AudioTrack) this.f15057l, (C15602l) this.f15058l, interfaceC14029l, 10);
            case 11:
                return new C7226l((AudioPlaylist) this.f15057l, (AudioTrack) this.f15058l, interfaceC14029l, 11);
            case 12:
                C7226l c7226l5 = new C7226l((C0732l) this.f15058l, interfaceC14029l, 12);
                c7226l5.f15057l = obj;
                return c7226l5;
            case 13:
                return new C7226l((C18723l) this.f15057l, (InterfaceC1489l) this.f15058l, interfaceC14029l, 13);
            case 14:
                C7226l c7226l6 = new C7226l((C18723l) this.f15058l, interfaceC14029l, 14);
                c7226l6.f15057l = obj;
                return c7226l6;
            case 15:
                C7226l c7226l7 = new C7226l((C6009l) this.f15058l, interfaceC14029l, 15);
                c7226l7.f15057l = obj;
                return c7226l7;
            case 16:
                return new C7226l((C7883l) this.f15057l, (String) this.f15058l, interfaceC14029l, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C7226l((C5685l) this.f15057l, (C9649l) this.f15058l, interfaceC14029l, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C7226l c7226l8 = new C7226l((C13220l) this.f15058l, interfaceC14029l, 18);
                c7226l8.f15057l = obj;
                return c7226l8;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C7226l((C11446l) this.f15057l, (InterfaceC12244l) this.f15058l, interfaceC14029l, 19);
            case 20:
                return new C7226l((C2403l) this.f15057l, (C15308l) this.f15058l, interfaceC14029l, 20);
            case 21:
                return new C7226l((AbstractC13264l) this.f15057l, (C15308l) this.f15058l, interfaceC14029l, 21);
            case 22:
                return new C7226l((InterfaceC7948l) this.f15057l, (C3625l) this.f15058l, interfaceC14029l, 22);
            case 23:
                return new C7226l((C1739l) this.f15057l, (C10700l) this.f15058l, interfaceC14029l, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C7226l((SessionWorker) this.f15057l, (C4043l) this.f15058l, interfaceC14029l, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C7226l((C9583l) this.f15057l, (C16895l) this.f15058l, interfaceC14029l, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C7226l((C14509l) this.f15057l, (C13315l) this.f15058l, interfaceC14029l, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C7226l((C14567l) this.f15057l, (C6539l) this.f15058l, interfaceC14029l, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C7226l((ShortcutBridgeActivity) this.f15057l, (InterfaceC17817l) this.f15058l, interfaceC14029l, 28);
            default:
                return new C7226l((C10038l) this.f15058l, interfaceC14029l, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15059l) {
            case 0:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C7226l) ads((InterfaceC14029l) obj2, (C4700l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C7226l) ads((InterfaceC14029l) obj2, (AbstractC5729l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C7226l) ads((InterfaceC14029l) obj2, (JSONObject) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C7226l) ads((InterfaceC14029l) obj2, (String) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 23:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C7226l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7226l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f15059l = i;
        this.f15058l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7226l(C7864l c7864l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f15059l = 1;
        this.f15057l = c7864l;
    }
}

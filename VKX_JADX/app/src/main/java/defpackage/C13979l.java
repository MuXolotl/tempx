package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘٓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13979l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f27274l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f27275l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f27276l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f27277l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f27278l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13979l(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f27276l = i;
        this.f27278l = obj;
        this.f27274l = obj2;
        this.f27275l = obj3;
        this.f27277l = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01b4 A[Catch: all -> 0x01b7, TryCatch #4 {all -> 0x01b7, blocks: (B:81:0x01b4, B:84:0x01ba, B:78:0x01ae, B:75:0x01a9), top: B:171:0x01a9, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba A[Catch: all -> 0x01b7, TRY_LEAVE, TryCatch #4 {all -> 0x01b7, blocks: (B:81:0x01b4, B:84:0x01ba, B:78:0x01ae, B:75:0x01a9), top: B:171:0x01a9, inners: #11 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        ?? arrayList;
        BluetoothAdapter adapter;
        BluetoothClass bluetoothClass;
        Cgoto c10934l;
        Throwable th;
        Throwable th2;
        Throwable th3;
        int i;
        int i2 = this.f27276l;
        int i3 = 11;
        ?? r7 = 0;
        Throwable th4 = null;
        int i4 = 0;
        boolean z = true;
        Object obj2 = this.f27277l;
        Object obj3 = this.f27275l;
        Object obj4 = this.f27274l;
        switch (i2) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                boolean zBooleanValue = ((Boolean) ((InterfaceC8714l) obj3).getValue()).booleanValue();
                BluetoothManager bluetoothManager = (BluetoothManager) ((Context) obj4).getSystemService(BluetoothManager.class);
                if (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null) {
                    arrayList = C2580l.f5619l;
                } else {
                    Set<BluetoothDevice> bondedDevices = adapter.getBondedDevices();
                    ArrayList<BluetoothDevice> arrayList2 = new ArrayList();
                    for (Object obj5 : bondedDevices) {
                        BluetoothDevice bluetoothDevice = (BluetoothDevice) obj5;
                        if (!zBooleanValue || ((bluetoothClass = bluetoothDevice.getBluetoothClass()) != null && bluetoothClass.getMajorDeviceClass() == 1024)) {
                            arrayList2.add(obj5);
                        }
                    }
                    arrayList = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
                    for (BluetoothDevice bluetoothDevice2 : arrayList2) {
                        String address = bluetoothDevice2.getAddress();
                        String name = bluetoothDevice2.getName();
                        if (name == null) {
                            name = bluetoothDevice2.getAddress();
                        }
                        arrayList.add(new C5419l(address, name));
                    }
                }
                C13939l c13939l = (C13939l) obj2;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : arrayList) {
                    if (!c13939l.f27227l.containsKey(((C5419l) obj6).yandex)) {
                        arrayList3.add(obj6);
                    }
                }
                return AbstractC0509l.billing(arrayList3);
            case 1:
                AbstractC2829l.crashlytics(obj);
                C2434l c2434l = (C2434l) obj4;
                C9173l c9173l = (C9173l) obj3;
                List list = (List) obj2;
                C7167l c7167l = new C7167l(AbstractC5921l.f12465l.mo691continue((C14025l) this.f27278l, false));
                try {
                    C16145l c16145l = new C16145l(c7167l);
                    EnumC6690l enumC6690l = EnumC6690l.f14038l;
                    int iInmobi = AbstractC5020l.inmobi(2);
                    if (iInmobi == 0) {
                        c10934l = new C10934l(c16145l);
                    } else {
                        if (iInmobi != 1) {
                            throw new RuntimeException("unsupported format detected, this should be impossible: EXT_M3U");
                        }
                        C15303l c15303l = new C15303l(c16145l);
                        ArrayList arrayList4 = new ArrayList();
                        c15303l.f29912l = arrayList4;
                        Collections.addAll(arrayList4, AbstractC16178l.yandex, AbstractC16178l.loadAd, AbstractC0036l.purchase, AbstractC0036l.mopub, AbstractC0036l.billing, AbstractC0036l.admob, AbstractC0036l.amazon, AbstractC10115l.crashlytics, AbstractC0036l.subs, AbstractC10115l.purchase, AbstractC10115l.amazon, AbstractC0036l.isPro, AbstractC0036l.crashlytics);
                        c10934l = c15303l;
                    }
                    C15019l c15019l = c2434l.yandex;
                    boolean z2 = c2434l.crashlytics;
                    int i5 = c2434l.amazon;
                    C6469l c6469lYandex = c9173l.yandex();
                    C2434l c2434l2 = new C2434l(c15019l, new C9173l(list, (List) c6469lYandex.f13506l, c6469lYandex.f13505l, (C2421l) c6469lYandex.f13503l, c6469lYandex.f13504l, c6469lYandex.f13502l, c6469lYandex.f13507l, (EnumC12305l) c6469lYandex.f13508l), z2, i5);
                    if (!((Set) C5008l.premium(c2434l2, C1461l.f3665l).f10245l).isEmpty()) {
                        throw new C10756l(10);
                    }
                    c10934l.mo225l(c2434l2);
                    ((OutputStreamWriter) ((C7972l) c10934l.f833l).f16631l).flush();
                    Unit unit = Unit.INSTANCE;
                    try {
                        c7167l.close();
                        break;
                    } catch (Throwable th5) {
                        r7 = th5;
                    }
                    if (r7 == 0) {
                        return Unit.INSTANCE;
                    }
                    throw r7;
                } catch (Throwable th6) {
                    Throwable th7 = th6;
                    try {
                        c7167l.close();
                        r7 = th7;
                    } catch (Throwable th8) {
                        AbstractC11718l.yandex(th7, th8);
                        r7 = th7;
                    }
                }
                break;
            case 2:
                AbstractC2829l.crashlytics(obj);
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f27278l;
                InterfaceC6843l interfaceC6843l = (InterfaceC6843l) obj4;
                AbstractC10999l.mopub(interfaceC2262l, null, 4, new C9837l(interfaceC6843l, (InterfaceC2077l) obj3, r7, i4), 1);
                AbstractC10999l.mopub(interfaceC2262l, null, 4, new C6637l(interfaceC6843l, (C16173l) obj2, (InterfaceC14029l) r7, i3), 1);
                return Unit.INSTANCE;
            case 3:
                AbstractC2829l.crashlytics(obj);
                C12382l c12382l = AbstractC5921l.f12465l;
                C14025l c14025l = (C14025l) this.f27278l;
                c12382l.mopub(c14025l);
                C7167l c7167l2 = new C7167l(c12382l.mo691continue(c14025l, false));
                String str = (String) obj4;
                CancellationSignal cancellationSignal = (CancellationSignal) obj3;
                Function2 function2 = (Function2) obj2;
                try {
                    VKXApplication.Companion companion = VKXApplication.f36628l;
                    C11610l c11610l = AbstractC3629l.yandex;
                    if (c11610l == null) {
                        c11610l = null;
                    }
                    C11644l c11644l = new C11644l(28);
                    c11644l.m3157l(str);
                    AbstractC6897l abstractC6897l = c11610l.yandex(new C17032l(c11644l)).billing().f35907l;
                    if (abstractC6897l != null) {
                        try {
                            float fBilling = abstractC6897l.billing();
                            InterfaceC9473l interfaceC9473lMo1516l = abstractC6897l.mo1516l();
                            long j = 0;
                            try {
                                try {
                                    while (!cancellationSignal.isCanceled()) {
                                        long jAd = interfaceC9473lMo1516l.ad(c7167l2.f14998l, 8192L);
                                        try {
                                            try {
                                                if (jAd != -1) {
                                                    j += jAd;
                                                    c7167l2.yandex();
                                                    if (function2 != null) {
                                                        function2.invoke(new Integer((int) (((Number) AbstractC8576l.admob(new Float(j / fBilling), new C12015l(0.0f, 1.0f))).floatValue() * 100.0f)), new Integer(100));
                                                    }
                                                } else {
                                                    z = false;
                                                    Unit unit2 = Unit.INSTANCE;
                                                    abstractC6897l.close();
                                                    th3 = null;
                                                    if (th3 != null) {
                                                        throw th3;
                                                    }
                                                    Unit unit3 = Unit.INSTANCE;
                                                }
                                                abstractC6897l.close();
                                            } catch (Throwable th9) {
                                                AbstractC11718l.yandex(th2, th9);
                                            }
                                            th3 = th2;
                                            if (th3 != null) {
                                                throw th3;
                                            }
                                            Unit unit4 = Unit.INSTANCE;
                                        } catch (Throwable th10) {
                                            th = th10;
                                            try {
                                                c7167l2.close();
                                            } catch (Throwable th11) {
                                                AbstractC11718l.yandex(th, th11);
                                            }
                                            th4 = th;
                                        }
                                        break;
                                    }
                                    abstractC6897l.close();
                                    th3 = null;
                                } catch (Throwable th12) {
                                    th3 = th12;
                                }
                                Unit unit5 = Unit.INSTANCE;
                            } catch (Throwable th13) {
                                th2 = th13;
                                abstractC6897l.close();
                                th3 = th2;
                            }
                        } catch (Throwable th14) {
                            th2 = th14;
                            z = false;
                        }
                        if (th3 != null) {
                            throw th3;
                        }
                        Unit unit6 = Unit.INSTANCE;
                    } else {
                        z = false;
                    }
                    try {
                        c7167l2.close();
                    } catch (Throwable th15) {
                        th4 = th15;
                    }
                    break;
                } catch (Throwable th16) {
                    th = th16;
                    z = false;
                }
                if (th4 != null) {
                    throw th4;
                }
                if (z) {
                    AbstractC5921l.f12465l.adcel(c14025l, false);
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f27278l;
                AbstractC2829l.crashlytics(obj);
                List list2 = (List) obj3;
                C4776l c4776l = (C4776l) obj2;
                int i6 = 0;
                for (Object obj7 : (List) obj4) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        AbstractC14055l.subscription();
                        throw null;
                    }
                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C9718l(list2, i6, ((C9735l) obj7).yandex, c4776l, (InterfaceC14029l) null), 3);
                    i6 = i7;
                }
                return Unit.INSTANCE;
            case 5:
                AbstractC2829l.crashlytics(obj);
                for (C4362l c4362l : ((C10712l) this.f27278l).billing.values()) {
                    Context context = (Context) obj4;
                    String str2 = c4362l.yandex;
                    String str3 = c4362l.loadAd;
                    try {
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), AbstractC9361l.pro((String) obj3, str2, (String) obj2));
                        try {
                            boolean zAppmetrica = AbstractC12024l.appmetrica(str3, "Italic", false);
                            boolean zAppmetrica2 = AbstractC12024l.appmetrica(str3, "Bold", false);
                            if (zAppmetrica && zAppmetrica2) {
                                i = 3;
                            } else if (zAppmetrica) {
                                i = 2;
                            } else {
                                i = zAppmetrica2 ? 1 : 0;
                            }
                            if (typefaceCreateFromAsset.getStyle() != i) {
                                typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i);
                            }
                            c4362l.crashlytics = typefaceCreateFromAsset;
                        } catch (Exception unused) {
                            AbstractC17968l.yandex.getClass();
                        }
                    } catch (Exception unused2) {
                        AbstractC17968l.yandex.getClass();
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC2829l.crashlytics(obj);
                C13572l c13572l = (C13572l) this.f27278l;
                C6499l c6499lIsPro = (C6499l) obj4;
                String str4 = (String) obj3;
                C17425l c17425l = (C17425l) obj2;
                c13572l.getClass();
                AbstractC12442l.admob(!TextUtils.isEmpty(str4));
                C3726l c3726l = c13572l.yandex;
                if (!c3726l.signatures || !c3726l.vip(c6499lIsPro) || (c6499lIsPro = c3726l.isPro()) != null) {
                    c3726l.mopub(c6499lIsPro, new C17406l(i4, c17425l, str4));
                }
                return new C9201l(0, SystemClock.elapsedRealtime(), null, null, null, 1);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f27276l;
        Object obj2 = this.f27277l;
        Object obj3 = this.f27275l;
        Object obj4 = this.f27274l;
        switch (i) {
            case 0:
                return new C13979l((C5766l) this.f27278l, (Context) obj4, (InterfaceC8714l) obj3, (C13939l) obj2, interfaceC14029l, 0);
            case 1:
                return new C13979l((C14025l) this.f27278l, (C2434l) obj4, (C9173l) obj3, (List) obj2, interfaceC14029l, 1);
            case 2:
                C13979l c13979l = new C13979l((InterfaceC6843l) obj4, (InterfaceC2077l) obj3, (C16173l) obj2, interfaceC14029l, 2);
                c13979l.f27278l = obj;
                return c13979l;
            case 3:
                return new C13979l((C14025l) this.f27278l, (String) obj4, (CancellationSignal) obj3, (Function2) obj2, interfaceC14029l, 3);
            case 4:
                C13979l c13979l2 = new C13979l((List) obj4, (List) obj3, (C4776l) obj2, interfaceC14029l, 4);
                c13979l2.f27278l = obj;
                return c13979l2;
            case 5:
                return new C13979l((C10712l) this.f27278l, (Context) obj4, (String) obj3, (String) obj2, interfaceC14029l, 5);
            default:
                return new C13979l((C13572l) this.f27278l, (C6499l) obj4, (String) obj3, (C17425l) obj2, interfaceC14029l, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f27276l) {
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
            case 5:
                break;
        }
        return ((C13979l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13979l(Object obj, Object obj2, Object obj3, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f27276l = i;
        this.f27274l = obj;
        this.f27275l = obj2;
        this.f27277l = obj3;
    }
}

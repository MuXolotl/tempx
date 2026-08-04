package defpackage;

import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: lَْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4854l {
    public Object admob;
    public final Object amazon;
    public Object billing;
    public final Object crashlytics;
    public int loadAd;
    public Object mopub;
    public final Cloneable purchase;
    public boolean yandex;

    public C4854l(C12919l c12919l, C5501l c5501l, C17778l c17778l, boolean z) {
        List listFirebase;
        this.crashlytics = c12919l;
        this.amazon = c5501l;
        this.purchase = c17778l;
        this.yandex = z;
        C2580l c2580l = C2580l.f5619l;
        this.billing = c2580l;
        this.mopub = c2580l;
        this.admob = new ArrayList();
        C6705l c6705l = c12919l.admob;
        c17778l.f34630l.getClass();
        URI uriAdmob = c6705l.admob();
        if (uriAdmob.getHost() == null) {
            listFirebase = AbstractC11432l.firebase(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = c12919l.mopub.select(uriAdmob);
            listFirebase = (listSelect == null || listSelect.isEmpty()) ? AbstractC11432l.firebase(new Proxy[]{Proxy.NO_PROXY}) : AbstractC11432l.isPro(listSelect);
        }
        this.billing = listFirebase;
        this.loadAd = 0;
        c17778l.f34630l.getClass();
    }

    public static void yandex(C4854l c4854l) {
        InterfaceC6384l interfaceC6384l = (InterfaceC6384l) c4854l.crashlytics;
        if (interfaceC6384l instanceof C2760l) {
            C2760l c2760l = (C2760l) interfaceC6384l;
            synchronized (c2760l) {
                c2760l.f5996l = 1;
            }
        }
    }

    public boolean crashlytics() {
        return this.loadAd < ((List) this.billing).size() || !((ArrayList) this.admob).isEmpty();
    }

    public InterfaceC11445l loadAd(int i) {
        InterfaceC11766l c0759l;
        HashMap map = (HashMap) this.purchase;
        InterfaceC11445l interfaceC11445l = (InterfaceC11445l) map.get(Integer.valueOf(i));
        if (interfaceC11445l != null) {
            return interfaceC11445l;
        }
        HashMap map2 = (HashMap) this.amazon;
        InterfaceC11766l interfaceC11766l = (InterfaceC11766l) map2.get(Integer.valueOf(i));
        if (interfaceC11766l == null) {
            final InterfaceC0587l interfaceC0587l = (InterfaceC0587l) this.billing;
            interfaceC0587l.getClass();
            final int i2 = 0;
            if (i != 0) {
                final int i3 = 1;
                if (i != 1) {
                    final int i4 = 2;
                    if (i != 2) {
                        final int i5 = 3;
                        if (i == 3) {
                            c0759l = new C0759l(i2, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC11445l.class));
                        } else if (i == 4) {
                            interfaceC11766l = new InterfaceC11766l() { // from class: lُٛۤ
                                @Override // defpackage.InterfaceC11766l
                                public final Object get() {
                                    int i6 = i5;
                                    InterfaceC0587l interfaceC0587l2 = interfaceC0587l;
                                    Object obj = this;
                                    switch (i6) {
                                        case 0:
                                            return C15291l.billing((Class) obj, interfaceC0587l2);
                                        case 1:
                                            return C15291l.billing((Class) obj, interfaceC0587l2);
                                        case 2:
                                            return C15291l.billing((Class) obj, interfaceC0587l2);
                                        default:
                                            return new C17588l(interfaceC0587l2, (InterfaceC6384l) ((C4854l) obj).crashlytics);
                                    }
                                }
                            };
                        } else {
                            C8339l.metrica(AbstractC0653l.vip(i, "Unrecognized contentType: "));
                            interfaceC11766l = null;
                        }
                    } else {
                        final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(InterfaceC11445l.class);
                        c0759l = new InterfaceC11766l() { // from class: lُٛۤ
                            @Override // defpackage.InterfaceC11766l
                            public final Object get() {
                                int i6 = i4;
                                InterfaceC0587l interfaceC0587l2 = interfaceC0587l;
                                Object obj = clsAsSubclass;
                                switch (i6) {
                                    case 0:
                                        return C15291l.billing((Class) obj, interfaceC0587l2);
                                    case 1:
                                        return C15291l.billing((Class) obj, interfaceC0587l2);
                                    case 2:
                                        return C15291l.billing((Class) obj, interfaceC0587l2);
                                    default:
                                        return new C17588l(interfaceC0587l2, (InterfaceC6384l) ((C4854l) obj).crashlytics);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC11445l.class);
                    c0759l = new InterfaceC11766l() { // from class: lُٛۤ
                        @Override // defpackage.InterfaceC11766l
                        public final Object get() {
                            int i6 = i3;
                            InterfaceC0587l interfaceC0587l2 = interfaceC0587l;
                            Object obj = genericDeclarationAsSubclass;
                            switch (i6) {
                                case 0:
                                    return C15291l.billing((Class) obj, interfaceC0587l2);
                                case 1:
                                    return C15291l.billing((Class) obj, interfaceC0587l2);
                                case 2:
                                    return C15291l.billing((Class) obj, interfaceC0587l2);
                                default:
                                    return new C17588l(interfaceC0587l2, (InterfaceC6384l) ((C4854l) obj).crashlytics);
                            }
                        }
                    };
                }
                interfaceC11766l = c0759l;
            } else {
                final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(InterfaceC11445l.class);
                interfaceC11766l = new InterfaceC11766l() { // from class: lُٛۤ
                    @Override // defpackage.InterfaceC11766l
                    public final Object get() {
                        int i6 = i2;
                        InterfaceC0587l interfaceC0587l2 = interfaceC0587l;
                        Object obj = genericDeclarationAsSubclass2;
                        switch (i6) {
                            case 0:
                                return C15291l.billing((Class) obj, interfaceC0587l2);
                            case 1:
                                return C15291l.billing((Class) obj, interfaceC0587l2);
                            case 2:
                                return C15291l.billing((Class) obj, interfaceC0587l2);
                            default:
                                return new C17588l(interfaceC0587l2, (InterfaceC6384l) ((C4854l) obj).crashlytics);
                        }
                    }
                };
            }
            map2.put(Integer.valueOf(i), interfaceC11766l);
        }
        InterfaceC11445l interfaceC11445l2 = (InterfaceC11445l) interfaceC11766l.get();
        C14513l c14513l = (C14513l) this.admob;
        if (c14513l != null) {
            interfaceC11445l2.purchase(c14513l);
        }
        interfaceC11445l2.yandex((C8565l) this.mopub);
        interfaceC11445l2.crashlytics(this.yandex);
        interfaceC11445l2.loadAd(this.loadAd);
        map.put(Integer.valueOf(i), interfaceC11445l2);
        return interfaceC11445l2;
    }

    public C4854l(InterfaceC6384l interfaceC6384l, C8565l c8565l) {
        this.crashlytics = interfaceC6384l;
        this.mopub = c8565l;
        this.amazon = new HashMap();
        this.purchase = new HashMap();
        this.yandex = true;
        this.loadAd = 3;
    }
}

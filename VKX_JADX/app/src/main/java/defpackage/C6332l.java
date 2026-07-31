package defpackage;

import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylistLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lًؙ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6332l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9427l f13279l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13280l;

    public C6332l(InterfaceC9427l interfaceC9427l, C14169l c14169l) {
        this.f13280l = 26;
        this.f13279l = interfaceC9427l;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x017f  */
    /* JADX WARN: Code duplicated, block: B:130:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:156:0x024c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0286  */
    /* JADX WARN: Code duplicated, block: B:192:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:208:0x0301  */
    /* JADX WARN: Code duplicated, block: B:224:0x0342  */
    /* JADX WARN: Code duplicated, block: B:240:0x0384  */
    /* JADX WARN: Code duplicated, block: B:256:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:284:0x0431  */
    /* JADX WARN: Code duplicated, block: B:312:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:332:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:358:0x0556  */
    /* JADX WARN: Code duplicated, block: B:374:0x0596  */
    /* JADX WARN: Code duplicated, block: B:392:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:410:0x060a  */
    /* JADX WARN: Code duplicated, block: B:428:0x0644  */
    /* JADX WARN: Code duplicated, block: B:454:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:472:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:490:0x0727  */
    /* JADX WARN: Code duplicated, block: B:506:0x076c  */
    /* JADX WARN: Code duplicated, block: B:528:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:548:0x0819  */
    /* JADX WARN: Code duplicated, block: B:571:0x087c  */
    /* JADX WARN: Code duplicated, block: B:589:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0129  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [lٌٍۜ] */
    /* JADX WARN: Type inference failed for: r6v1, types: [lٌٍۜ] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        C16624l c16624l;
        C14498l c14498l;
        C0988l c0988l;
        Object c8344l;
        C17917l c17917l;
        C2129l c2129l;
        C9160l c9160l;
        C12597l c12597l;
        C11035l c11035l;
        C14250l c14250l;
        C12130l c12130lCrashlytics;
        C12760l c12760l;
        C4939l c4939l;
        C13136l c13136l;
        C15364l c15364l;
        C1573l c1573l;
        Object objPurchase;
        InterfaceC11334l interfaceC11334lYandex;
        C11080l c11080l;
        C15787l c15787l;
        C15261l c15261l;
        C10391l c10391l;
        C11136l c11136l;
        C1165l c1165l;
        C17489l c17489l;
        C6519l c6519l;
        C10669l c10669l;
        C7903l c7903l;
        InterfaceC11334l interfaceC11334lYandex2;
        C14001l c14001l;
        C14616l c14616l;
        ?? r6;
        C16252l c16252l;
        C7691l c7691l;
        C1048l c1048l;
        C3777l c3777l;
        int i = this.f13280l;
        ?? arrayList = C2580l.f5619l;
        int i2 = 0;
        z = false;
        z = false;
        boolean z = false;
        ?? r7 = this.f13279l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                if (interfaceC14029l instanceof C16624l) {
                    c16624l = (C16624l) interfaceC14029l;
                    int i3 = c16624l.f32600l;
                    if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c16624l.f32600l = i3 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c16624l = new C16624l(this, interfaceC14029l);
                    }
                } else {
                    c16624l = new C16624l(this, interfaceC14029l);
                }
                Object obj2 = c16624l.f32601l;
                int i4 = c16624l.f32600l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj2);
                    AbstractC18643l abstractC18643l = ((C10507l) obj).loadAd;
                    c16624l.f32600l = 1;
                    if (r7.isPro(abstractC18643l, c16624l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj2);
                }
                return Unit.INSTANCE;
            case 1:
                if (interfaceC14029l instanceof C14498l) {
                    c14498l = (C14498l) interfaceC14029l;
                    int i5 = c14498l.f28375l;
                    if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c14498l.f28375l = i5 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c14498l = new C14498l(this, interfaceC14029l);
                    }
                } else {
                    c14498l = new C14498l(this, interfaceC14029l);
                }
                Object obj3 = c14498l.f28376l;
                int i6 = c14498l.f28375l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj3);
                    if (obj instanceof C1215l) {
                        c14498l.f28375l = 1;
                        if (r7.isPro(obj, c14498l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj3);
                }
                return Unit.INSTANCE;
            case 2:
                if (interfaceC14029l instanceof C0988l) {
                    c0988l = (C0988l) interfaceC14029l;
                    int i7 = c0988l.f2711l;
                    if ((i7 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c0988l.f2711l = i7 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c0988l = new C0988l(this, interfaceC14029l);
                    }
                } else {
                    c0988l = new C0988l(this, interfaceC14029l);
                }
                Object obj4 = c0988l.f2712l;
                int i8 = c0988l.f2711l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj4);
                    CachedPlaylist cachedPlaylist = (CachedPlaylist) ((InterfaceC12897l) obj).yandex();
                    if (cachedPlaylist != null) {
                        String strM4618throws = cachedPlaylist.m4618throws();
                        int size = cachedPlaylist.purchase().size();
                        String strIsVip = cachedPlaylist.isVip();
                        if (strIsVip == null) {
                            C16287l.yandex.getClass();
                            strIsVip = C16287l.amazon();
                        }
                        c8344l = new C8344l(strM4618throws, size, strIsVip);
                    } else {
                        c8344l = C0617l.yandex;
                    }
                    c0988l.f2711l = 1;
                    if (r7.isPro(c8344l, c0988l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj4);
                }
                return Unit.INSTANCE;
            case 3:
                if (interfaceC14029l instanceof C17917l) {
                    c17917l = (C17917l) interfaceC14029l;
                    int i9 = c17917l.f34878l;
                    if ((i9 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c17917l.f34878l = i9 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c17917l = new C17917l(this, interfaceC14029l);
                    }
                } else {
                    c17917l = new C17917l(this, interfaceC14029l);
                }
                Object obj5 = c17917l.f34879l;
                int i10 = c17917l.f34878l;
                if (i10 == 0) {
                    AbstractC2829l.crashlytics(obj5);
                    CachedLibrary cachedLibrary = (CachedLibrary) ((InterfaceC12897l) obj).yandex();
                    Object c17152l = cachedLibrary != null ? new C17152l(cachedLibrary.loadAd(), cachedLibrary.yandex().size()) : C10797l.yandex;
                    c17917l.f34878l = 1;
                    if (r7.isPro(c17152l, c17917l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i10 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj5);
                }
                return Unit.INSTANCE;
            case 4:
                if (interfaceC14029l instanceof C2129l) {
                    c2129l = (C2129l) interfaceC14029l;
                    int i11 = c2129l.f4767l;
                    if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c2129l.f4767l = i11 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c2129l = new C2129l(this, interfaceC14029l);
                    }
                } else {
                    c2129l = new C2129l(this, interfaceC14029l);
                }
                Object obj6 = c2129l.f4768l;
                int i12 = c2129l.f4767l;
                if (i12 == 0) {
                    AbstractC2829l.crashlytics(obj6);
                    Long l = new Long(((Number) obj).longValue());
                    Long l2 = l.longValue() > 0 ? l : null;
                    Object c5969l = l2 != null ? new C5969l((int) l2.longValue()) : C16614l.yandex;
                    c2129l.f4767l = 1;
                    if (r7.isPro(c5969l, c2129l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i12 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj6);
                }
                return Unit.INSTANCE;
            case 5:
                if (interfaceC14029l instanceof C9160l) {
                    c9160l = (C9160l) interfaceC14029l;
                    int i13 = c9160l.f18858l;
                    if ((i13 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c9160l.f18858l = i13 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c9160l = new C9160l(this, interfaceC14029l);
                    }
                } else {
                    c9160l = new C9160l(this, interfaceC14029l);
                }
                Object obj7 = c9160l.f18859l;
                int i14 = c9160l.f18858l;
                if (i14 == 0) {
                    AbstractC2829l.crashlytics(obj7);
                    List list = (List) obj;
                    C5086l c5086l = new C5086l(false, list.isEmpty(), AbstractC0509l.purchase(list));
                    c9160l.f18858l = 1;
                    if (r7.isPro(c5086l, c9160l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i14 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj7);
                }
                return Unit.INSTANCE;
            case 6:
                if (interfaceC14029l instanceof C12597l) {
                    c12597l = (C12597l) interfaceC14029l;
                    int i15 = c12597l.f24814l;
                    if ((i15 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c12597l.f24814l = i15 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c12597l = new C12597l(this, interfaceC14029l);
                    }
                } else {
                    c12597l = new C12597l(this, interfaceC14029l);
                }
                Object obj8 = c12597l.f24815l;
                int i16 = c12597l.f24814l;
                if (i16 == 0) {
                    AbstractC2829l.crashlytics(obj8);
                    if (obj instanceof C7649l) {
                        c12597l.f24814l = 1;
                        if (r7.isPro(obj, c12597l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj8);
                }
                return Unit.INSTANCE;
            case 7:
                if (interfaceC14029l instanceof C11035l) {
                    c11035l = (C11035l) interfaceC14029l;
                    int i17 = c11035l.f22236l;
                    if ((i17 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c11035l.f22236l = i17 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c11035l = new C11035l(this, interfaceC14029l);
                    }
                } else {
                    c11035l = new C11035l(this, interfaceC14029l);
                }
                Object obj9 = c11035l.f22237l;
                int i18 = c11035l.f22236l;
                if (i18 == 0) {
                    AbstractC2829l.crashlytics(obj9);
                    if (obj instanceof C15021l) {
                        c11035l.f22236l = 1;
                        if (r7.isPro(obj, c11035l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj9);
                }
                return Unit.INSTANCE;
            case 8:
                if (interfaceC14029l instanceof C14250l) {
                    c14250l = (C14250l) interfaceC14029l;
                    int i19 = c14250l.f27848l;
                    if ((i19 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c14250l.f27848l = i19 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c14250l = new C14250l(this, interfaceC14029l);
                    }
                } else {
                    c14250l = new C14250l(this, interfaceC14029l);
                }
                Object obj10 = c14250l.f27849l;
                int i20 = c14250l.f27848l;
                if (i20 == 0) {
                    AbstractC2829l.crashlytics(obj10);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        String str = ((C10160l) it.next()).yandex;
                        try {
                            c12130lCrashlytics = C12371l.crashlytics(str, null, null);
                        } catch (Exception e) {
                            Log.w("PipePresenceSrc", "Failed to create CameraIdentifier for pipeId: " + str, e);
                            c12130lCrashlytics = null;
                        }
                        if (c12130lCrashlytics != null) {
                            arrayList2.add(c12130lCrashlytics);
                        }
                        break;
                    }
                    c14250l.f27848l = 1;
                    if (r7.isPro(arrayList2, c14250l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i20 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj10);
                }
                return Unit.INSTANCE;
            case 9:
                if (interfaceC14029l instanceof C12760l) {
                    c12760l = (C12760l) interfaceC14029l;
                    int i21 = c12760l.f25141l;
                    if ((i21 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c12760l.f25141l = i21 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c12760l = new C12760l(this, interfaceC14029l);
                    }
                } else {
                    c12760l = new C12760l(this, interfaceC14029l);
                }
                Object obj11 = c12760l.f25142l;
                int i22 = c12760l.f25141l;
                if (i22 == 0) {
                    AbstractC2829l.crashlytics(obj11);
                    if (obj instanceof C15200l) {
                        c12760l.f25141l = 1;
                        if (r7.isPro(obj, c12760l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj11);
                }
                return Unit.INSTANCE;
            case 10:
                if (interfaceC14029l instanceof C4939l) {
                    c4939l = (C4939l) interfaceC14029l;
                    int i23 = c4939l.f10057l;
                    if ((i23 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4939l.f10057l = i23 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c4939l = new C4939l(this, interfaceC14029l);
                    }
                } else {
                    c4939l = new C4939l(this, interfaceC14029l);
                }
                Object obj12 = c4939l.f10058l;
                int i24 = c4939l.f10057l;
                if (i24 == 0) {
                    AbstractC2829l.crashlytics(obj12);
                    if (obj instanceof C2807l) {
                        c4939l.f10057l = 1;
                        if (r7.isPro(obj, c4939l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj12);
                }
                return Unit.INSTANCE;
            case 11:
                if (interfaceC14029l instanceof C13136l) {
                    c13136l = (C13136l) interfaceC14029l;
                    int i25 = c13136l.f25683l;
                    if ((i25 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c13136l.f25683l = i25 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c13136l = new C13136l(this, interfaceC14029l);
                    }
                } else {
                    c13136l = new C13136l(this, interfaceC14029l);
                }
                Object obj13 = c13136l.f25684l;
                int i26 = c13136l.f25683l;
                if (i26 == 0) {
                    AbstractC2829l.crashlytics(obj13);
                    if (obj instanceof C14050l) {
                        c13136l.f25683l = 1;
                        if (r7.isPro(obj, c13136l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj13);
                }
                return Unit.INSTANCE;
            case 12:
                if (interfaceC14029l instanceof C15364l) {
                    c15364l = (C15364l) interfaceC14029l;
                    int i27 = c15364l.f30038l;
                    if ((i27 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c15364l.f30038l = i27 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c15364l = new C15364l(this, interfaceC14029l);
                    }
                } else {
                    c15364l = new C15364l(this, interfaceC14029l);
                }
                Object obj14 = c15364l.f30039l;
                int i28 = c15364l.f30038l;
                if (i28 == 0) {
                    AbstractC2829l.crashlytics(obj14);
                    Object objM4217extends = AbstractC16901l.m4217extends(((C16480l) obj).yandex());
                    c15364l.f30038l = 1;
                    if (r7.isPro(objM4217extends, c15364l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i28 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj14);
                }
                return Unit.INSTANCE;
            case 13:
                if (interfaceC14029l instanceof C1573l) {
                    c1573l = (C1573l) interfaceC14029l;
                    int i29 = c1573l.f3894l;
                    if ((i29 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c1573l.f3894l = i29 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c1573l = new C1573l(this, interfaceC14029l);
                    }
                } else {
                    c1573l = new C1573l(this, interfaceC14029l);
                }
                Object obj15 = c1573l.f3895l;
                int i30 = c1573l.f3894l;
                if (i30 == 0) {
                    AbstractC2829l.crashlytics(obj15);
                    CachedPlaylistLibrary cachedPlaylistLibrary = (CachedPlaylistLibrary) ((InterfaceC12897l) obj).yandex();
                    if (cachedPlaylistLibrary == null || (interfaceC11334lYandex = cachedPlaylistLibrary.yandex()) == null) {
                        objPurchase = C11507l.f23131l;
                    } else {
                        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(interfaceC11334lYandex, 10));
                        Iterator it2 = interfaceC11334lYandex.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(new C0913l((CachedPlaylist) it2.next()));
                        }
                        objPurchase = AbstractC0509l.purchase(arrayList3);
                    }
                    c1573l.f3894l = 1;
                    if (r7.isPro(objPurchase, c1573l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i30 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj15);
                }
                return Unit.INSTANCE;
            case 14:
                if (interfaceC14029l instanceof C11080l) {
                    c11080l = (C11080l) interfaceC14029l;
                    int i31 = c11080l.f22289l;
                    if ((i31 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c11080l.f22289l = i31 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c11080l = new C11080l(this, interfaceC14029l);
                    }
                } else {
                    c11080l = new C11080l(this, interfaceC14029l);
                }
                Object obj16 = c11080l.f22290l;
                int i32 = c11080l.f22289l;
                if (i32 == 0) {
                    AbstractC2829l.crashlytics(obj16);
                    EnumC5154l enumC5154l = ((Number) obj).longValue() == 0 ? EnumC5154l.f11199l : EnumC5154l.f11198l;
                    c11080l.f22289l = 1;
                    if (r7.isPro(enumC5154l, c11080l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i32 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj16);
                }
                return Unit.INSTANCE;
            case 15:
                if (interfaceC14029l instanceof C15787l) {
                    c15787l = (C15787l) interfaceC14029l;
                    int i33 = c15787l.f30999l;
                    if ((i33 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c15787l.f30999l = i33 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c15787l = new C15787l(this, interfaceC14029l);
                    }
                } else {
                    c15787l = new C15787l(this, interfaceC14029l);
                }
                Object obj17 = c15787l.f31000l;
                int i34 = c15787l.f30999l;
                if (i34 == 0) {
                    AbstractC2829l.crashlytics(obj17);
                    CachedPlaylist cachedPlaylist2 = (CachedPlaylist) ((InterfaceC12897l) obj).yandex();
                    InterfaceC11334l interfaceC11334lPurchase = cachedPlaylist2 != null ? cachedPlaylist2.purchase() : null;
                    if (interfaceC11334lPurchase != null) {
                        arrayList = interfaceC11334lPurchase;
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj18 : arrayList) {
                        if (hashSet.add(((CachedTrack) obj18).m4635implements())) {
                            arrayList4.add(obj18);
                        }
                    }
                    c15787l.f30999l = 1;
                    if (r7.isPro(arrayList4, c15787l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i34 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj17);
                }
                return Unit.INSTANCE;
            case 16:
                if (interfaceC14029l instanceof C15261l) {
                    c15261l = (C15261l) interfaceC14029l;
                    int i35 = c15261l.f29854l;
                    if ((i35 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c15261l.f29854l = i35 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c15261l = new C15261l(this, interfaceC14029l);
                    }
                } else {
                    c15261l = new C15261l(this, interfaceC14029l);
                }
                Object obj19 = c15261l.f29855l;
                int i36 = c15261l.f29854l;
                if (i36 == 0) {
                    AbstractC2829l.crashlytics(obj19);
                    CachedLibrary cachedLibrary2 = (CachedLibrary) ((InterfaceC12897l) obj).yandex();
                    InterfaceC11334l interfaceC11334lYandex3 = cachedLibrary2 != null ? cachedLibrary2.yandex() : null;
                    if (interfaceC11334lYandex3 != null) {
                        arrayList = interfaceC11334lYandex3;
                    }
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj20 : arrayList) {
                        if (hashSet2.add(((CachedTrack) obj20).m4635implements())) {
                            arrayList5.add(obj20);
                        }
                    }
                    c15261l.f29854l = 1;
                    if (r7.isPro(arrayList5, c15261l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i36 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj19);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (interfaceC14029l instanceof C10391l) {
                    c10391l = (C10391l) interfaceC14029l;
                    int i37 = c10391l.f21211l;
                    if ((i37 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10391l.f21211l = i37 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10391l = new C10391l(this, interfaceC14029l);
                    }
                } else {
                    c10391l = new C10391l(this, interfaceC14029l);
                }
                Object obj21 = c10391l.f21212l;
                int i38 = c10391l.f21211l;
                if (i38 == 0) {
                    AbstractC2829l.crashlytics(obj21);
                    InterfaceC5130l interfaceC5130lYandex = ((C16480l) obj).yandex();
                    c10391l.f21211l = 1;
                    if (r7.isPro(interfaceC5130lYandex, c10391l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i38 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj21);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (interfaceC14029l instanceof C11136l) {
                    c11136l = (C11136l) interfaceC14029l;
                    int i39 = c11136l.f22354l;
                    if ((i39 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c11136l.f22354l = i39 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c11136l = new C11136l(this, interfaceC14029l);
                    }
                } else {
                    c11136l = new C11136l(this, interfaceC14029l);
                }
                Object obj22 = c11136l.f22355l;
                int i40 = c11136l.f22354l;
                if (i40 == 0) {
                    AbstractC2829l.crashlytics(obj22);
                    Integer num = new Integer((int) ((Number) obj).longValue());
                    c11136l.f22354l = 1;
                    if (r7.isPro(num, c11136l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i40 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj22);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                if (interfaceC14029l instanceof C1165l) {
                    c1165l = (C1165l) interfaceC14029l;
                    int i41 = c1165l.f3150l;
                    if ((i41 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c1165l.f3150l = i41 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c1165l = new C1165l(this, interfaceC14029l);
                    }
                } else {
                    c1165l = new C1165l(this, interfaceC14029l);
                }
                Object obj23 = c1165l.f3151l;
                int i42 = c1165l.f3150l;
                if (i42 == 0) {
                    AbstractC2829l.crashlytics(obj23);
                    Integer num2 = new Integer(((List) obj).size());
                    c1165l.f3150l = 1;
                    if (r7.isPro(num2, c1165l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i42 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj23);
                }
                return Unit.INSTANCE;
            case 20:
                if (interfaceC14029l instanceof C17489l) {
                    c17489l = (C17489l) interfaceC14029l;
                    int i43 = c17489l.f34070l;
                    if ((i43 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c17489l.f34070l = i43 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c17489l = new C17489l(this, interfaceC14029l);
                    }
                } else {
                    c17489l = new C17489l(this, interfaceC14029l);
                }
                Object obj24 = c17489l.f34071l;
                int i44 = c17489l.f34070l;
                if (i44 == 0) {
                    AbstractC2829l.crashlytics(obj24);
                    Integer num3 = new Integer(((List) obj).size());
                    c17489l.f34070l = 1;
                    if (r7.isPro(num3, c17489l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i44 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj24);
                }
                return Unit.INSTANCE;
            case 21:
                if (interfaceC14029l instanceof C6519l) {
                    c6519l = (C6519l) interfaceC14029l;
                    int i45 = c6519l.f13590l;
                    if ((i45 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c6519l.f13590l = i45 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c6519l = new C6519l(this, interfaceC14029l);
                    }
                } else {
                    c6519l = new C6519l(this, interfaceC14029l);
                }
                Object obj25 = c6519l.f13591l;
                int i46 = c6519l.f13590l;
                if (i46 == 0) {
                    AbstractC2829l.crashlytics(obj25);
                    if (obj instanceof C7649l) {
                        c6519l.f13590l = 1;
                        if (r7.isPro(obj, c6519l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i46 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj25);
                }
                return Unit.INSTANCE;
            case 22:
                if (interfaceC14029l instanceof C10669l) {
                    c10669l = (C10669l) interfaceC14029l;
                    int i47 = c10669l.f21657l;
                    if ((i47 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10669l.f21657l = i47 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10669l = new C10669l(this, interfaceC14029l);
                    }
                } else {
                    c10669l = new C10669l(this, interfaceC14029l);
                }
                Object obj26 = c10669l.f21658l;
                int i48 = c10669l.f21657l;
                if (i48 == 0) {
                    AbstractC2829l.crashlytics(obj26);
                    if (obj instanceof C15021l) {
                        c10669l.f21657l = 1;
                        if (r7.isPro(obj, c10669l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i48 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj26);
                }
                return Unit.INSTANCE;
            case 23:
                if (interfaceC14029l instanceof C7903l) {
                    c7903l = (C7903l) interfaceC14029l;
                    int i49 = c7903l.f16480l;
                    if ((i49 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c7903l.f16480l = i49 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c7903l = new C7903l(this, interfaceC14029l);
                    }
                } else {
                    c7903l = new C7903l(this, interfaceC14029l);
                }
                Object obj27 = c7903l.f16481l;
                int i50 = c7903l.f16480l;
                if (i50 == 0) {
                    AbstractC2829l.crashlytics(obj27);
                    CachedPlaylistLibrary cachedPlaylistLibrary2 = (CachedPlaylistLibrary) ((InterfaceC12897l) obj).yandex();
                    if (cachedPlaylistLibrary2 != null && (interfaceC11334lYandex2 = cachedPlaylistLibrary2.yandex()) != null) {
                        HashSet hashSet3 = new HashSet();
                        arrayList = new ArrayList();
                        for (Object obj28 : interfaceC11334lYandex2) {
                            if (hashSet3.add(((CachedPlaylist) obj28).m4618throws())) {
                                arrayList.add(obj28);
                            }
                        }
                    }
                    c7903l.f16480l = 1;
                    if (r7.isPro(arrayList, c7903l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i50 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj27);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                if (interfaceC14029l instanceof C14001l) {
                    c14001l = (C14001l) interfaceC14029l;
                    int i51 = c14001l.f27307l;
                    if ((i51 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c14001l.f27307l = i51 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c14001l = new C14001l(this, interfaceC14029l);
                    }
                } else {
                    c14001l = new C14001l(this, interfaceC14029l);
                }
                Object obj29 = c14001l.f27308l;
                int i52 = c14001l.f27307l;
                if (i52 == 0) {
                    AbstractC2829l.crashlytics(obj29);
                    List list2 = (List) obj;
                    ArrayList arrayList6 = new ArrayList(AbstractC14055l.billing(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(new C0913l((CachedPlaylist) it3.next()));
                    }
                    InterfaceC13238l interfaceC13238lPurchase = AbstractC0509l.purchase(arrayList6);
                    c14001l.f27307l = 1;
                    if (r7.isPro(interfaceC13238lPurchase, c14001l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i52 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj29);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                if (interfaceC14029l instanceof C14616l) {
                    c14616l = (C14616l) interfaceC14029l;
                    int i53 = c14616l.f28607l;
                    if ((i53 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c14616l.f28607l = i53 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c14616l = new C14616l(this, interfaceC14029l);
                    }
                } else {
                    c14616l = new C14616l(this, interfaceC14029l);
                }
                Object objSubscription = c14616l.f28608l;
                int i54 = c14616l.f28607l;
                if (i54 != 0) {
                    if (i54 == 1) {
                        i2 = c14616l.f28605l;
                        InterfaceC9427l interfaceC9427l = c14616l.f28609l;
                        AbstractC2829l.crashlytics(objSubscription);
                        r6 = interfaceC9427l;
                    } else {
                        if (i54 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(objSubscription);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(objSubscription);
                C15718l c15718l = C15718l.f30869l;
                c14616l.f28609l = r7;
                c14616l.f28605l = 0;
                c14616l.f28607l = 1;
                objSubscription = c15718l.subscription((String) obj, c14616l);
                if (objSubscription == enumC9342l) {
                    r6 = r7;
                    return enumC9342l;
                }
                r6 = r7;
                c14616l.f28609l = null;
                c14616l.f28605l = i2;
                c14616l.f28607l = 2;
                if (r6.isPro(objSubscription, c14616l) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                if (interfaceC14029l instanceof C16252l) {
                    c16252l = (C16252l) interfaceC14029l;
                    int i55 = c16252l.f31806l;
                    if ((i55 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c16252l.f31806l = i55 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c16252l = new C16252l(this, interfaceC14029l);
                    }
                } else {
                    c16252l = new C16252l(this, interfaceC14029l);
                }
                Object obj30 = c16252l.f31807l;
                int i56 = c16252l.f31806l;
                if (i56 == 0) {
                    AbstractC2829l.crashlytics(obj30);
                    C5492l c5492l = (C5492l) obj;
                    if (c5492l != null) {
                        long j = c5492l.loadAd;
                        C7644l c7644l = VKXApplication.f36633l;
                        if (j == ((C4645l) (c7644l != null ? c7644l : null).f15735l).yandex && c5492l.crashlytics) {
                            z = true;
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    c16252l.f31806l = 1;
                    if (r7.isPro(boolValueOf, c16252l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i56 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj30);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                if (interfaceC14029l instanceof C7691l) {
                    c7691l = (C7691l) interfaceC14029l;
                    int i57 = c7691l.f16141l;
                    if ((i57 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c7691l.f16141l = i57 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c7691l = new C7691l(this, interfaceC14029l);
                    }
                } else {
                    c7691l = new C7691l(this, interfaceC14029l);
                }
                Object obj31 = c7691l.f16142l;
                int i58 = c7691l.f16141l;
                if (i58 == 0) {
                    AbstractC2829l.crashlytics(obj31);
                    if (obj instanceof C14704l) {
                        c7691l.f16141l = 1;
                        if (r7.isPro(obj, c7691l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i58 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj31);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (interfaceC14029l instanceof C1048l) {
                    c1048l = (C1048l) interfaceC14029l;
                    int i59 = c1048l.f2910l;
                    if ((i59 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c1048l.f2910l = i59 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c1048l = new C1048l(this, interfaceC14029l);
                    }
                } else {
                    c1048l = new C1048l(this, interfaceC14029l);
                }
                Object obj32 = c1048l.f2911l;
                int i60 = c1048l.f2910l;
                if (i60 == 0) {
                    AbstractC2829l.crashlytics(obj32);
                    if (obj instanceof C3426l) {
                        c1048l.f2910l = 1;
                        if (r7.isPro(obj, c1048l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i60 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj32);
                }
                return Unit.INSTANCE;
            default:
                if (interfaceC14029l instanceof C3777l) {
                    c3777l = (C3777l) interfaceC14029l;
                    int i61 = c3777l.f7863l;
                    if ((i61 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c3777l.f7863l = i61 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c3777l = new C3777l(this, interfaceC14029l);
                    }
                } else {
                    c3777l = new C3777l(this, interfaceC14029l);
                }
                Object obj33 = c3777l.f7864l;
                int i62 = c3777l.f7863l;
                if (i62 == 0) {
                    AbstractC2829l.crashlytics(obj33);
                    if (obj instanceof C1725l) {
                        c3777l.f7863l = 1;
                        if (r7.isPro(obj, c3777l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i62 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj33);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C6332l(InterfaceC9427l interfaceC9427l, int i) {
        this.f13280l = i;
        this.f13279l = interfaceC9427l;
    }
}

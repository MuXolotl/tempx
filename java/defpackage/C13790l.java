package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Unit;
import ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lْۥٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13790l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9427l f26914l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26915l;

    public /* synthetic */ C13790l(InterfaceC9427l interfaceC9427l, int i) {
        this.f26915l = i;
        this.f26914l = interfaceC9427l;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x017c  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:171:0x022a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0264  */
    /* JADX WARN: Code duplicated, block: B:216:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:232:0x0321  */
    /* JADX WARN: Code duplicated, block: B:248:0x0361  */
    /* JADX WARN: Code duplicated, block: B:270:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:288:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:306:0x042d  */
    /* JADX WARN: Code duplicated, block: B:324:0x0467  */
    /* JADX WARN: Code duplicated, block: B:340:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:358:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:376:0x051a  */
    /* JADX WARN: Code duplicated, block: B:394:0x0554  */
    /* JADX WARN: Code duplicated, block: B:412:0x058e  */
    /* JADX WARN: Code duplicated, block: B:430:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:448:0x0602  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:466:0x063c  */
    /* JADX WARN: Code duplicated, block: B:484:0x0676  */
    /* JADX WARN: Code duplicated, block: B:502:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:518:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x0108  */
    /* JADX WARN: Code duplicated, block: B:99:0x0142  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        C5851l c5851l;
        C6522l c6522l;
        C3510l c3510l;
        C8478l c8478l;
        C1475l c1475l;
        C5158l c5158l;
        C18111l c18111l;
        C14320l c14320l;
        C10172l c10172l;
        C15928l c15928l;
        C12361l c12361l;
        C10888l c10888l;
        C3355l c3355l;
        C3564l c3564l;
        C12699l c12699l;
        C12177l c12177l;
        int i;
        C16848l c16848l;
        C16945l c16945l;
        C14380l c14380l;
        C9832l c9832l;
        C5208l c5208l;
        C4174l c4174l;
        C0947l c0947l;
        C5545l c5545l;
        C14351l c14351l;
        C8083l c8083l;
        C15073l c15073l;
        C10906l c10906l;
        C4754l c4754l;
        int i2 = this.f26915l;
        InterfaceC9427l interfaceC9427l = this.f26914l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i2) {
            case 0:
                if (interfaceC14029l instanceof C5851l) {
                    c5851l = (C5851l) interfaceC14029l;
                    int i3 = c5851l.f12342l;
                    if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c5851l.f12342l = i3 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c5851l = new C5851l(this, interfaceC14029l);
                    }
                } else {
                    c5851l = new C5851l(this, interfaceC14029l);
                }
                Object obj2 = c5851l.f12343l;
                int i4 = c5851l.f12342l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj2);
                    if (!(((AbstractC18643l) obj) instanceof C4167l)) {
                        c5851l.f12342l = 1;
                        if (interfaceC9427l.isPro(obj, c5851l) == enumC9342l) {
                            return enumC9342l;
                        }
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
                if (interfaceC14029l instanceof C6522l) {
                    c6522l = (C6522l) interfaceC14029l;
                    int i5 = c6522l.f13593l;
                    if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c6522l.f13593l = i5 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c6522l = new C6522l(this, interfaceC14029l);
                    }
                } else {
                    c6522l = new C6522l(this, interfaceC14029l);
                }
                Object obj3 = c6522l.f13594l;
                int i6 = c6522l.f13593l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj3);
                    AbstractC18643l abstractC18643l = ((C10507l) obj).loadAd;
                    c6522l.f13593l = 1;
                    if (interfaceC9427l.isPro(abstractC18643l, c6522l) == enumC9342l) {
                        return enumC9342l;
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
                if (interfaceC14029l instanceof C3510l) {
                    c3510l = (C3510l) interfaceC14029l;
                    int i7 = c3510l.f7403l;
                    if ((i7 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c3510l.f7403l = i7 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c3510l = new C3510l(this, interfaceC14029l);
                    }
                } else {
                    c3510l = new C3510l(this, interfaceC14029l);
                }
                Object obj4 = c3510l.f7404l;
                int i8 = c3510l.f7403l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj4);
                    if (obj instanceof C7541l) {
                        c3510l.f7403l = 1;
                        if (interfaceC9427l.isPro(obj, c3510l) == enumC9342l) {
                            return enumC9342l;
                        }
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
                if (interfaceC14029l instanceof C8478l) {
                    c8478l = (C8478l) interfaceC14029l;
                    int i9 = c8478l.f17520l;
                    if ((i9 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c8478l.f17520l = i9 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c8478l = new C8478l(this, interfaceC14029l);
                    }
                } else {
                    c8478l = new C8478l(this, interfaceC14029l);
                }
                Object obj5 = c8478l.f17521l;
                int i10 = c8478l.f17520l;
                if (i10 == 0) {
                    AbstractC2829l.crashlytics(obj5);
                    if (obj instanceof C8774l) {
                        c8478l.f17520l = 1;
                        if (interfaceC9427l.isPro(obj, c8478l) == enumC9342l) {
                            return enumC9342l;
                        }
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
                if (interfaceC14029l instanceof C1475l) {
                    c1475l = (C1475l) interfaceC14029l;
                    int i11 = c1475l.f3681l;
                    if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c1475l.f3681l = i11 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c1475l = new C1475l(this, interfaceC14029l);
                    }
                } else {
                    c1475l = new C1475l(this, interfaceC14029l);
                }
                Object obj6 = c1475l.f3682l;
                int i12 = c1475l.f3681l;
                if (i12 == 0) {
                    AbstractC2829l.crashlytics(obj6);
                    if (obj instanceof C7649l) {
                        c1475l.f3681l = 1;
                        if (interfaceC9427l.isPro(obj, c1475l) == enumC9342l) {
                            return enumC9342l;
                        }
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
                if (interfaceC14029l instanceof C5158l) {
                    c5158l = (C5158l) interfaceC14029l;
                    int i13 = c5158l.f11207l;
                    if ((i13 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c5158l.f11207l = i13 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c5158l = new C5158l(this, interfaceC14029l);
                    }
                } else {
                    c5158l = new C5158l(this, interfaceC14029l);
                }
                Object obj7 = c5158l.f11208l;
                int i14 = c5158l.f11207l;
                if (i14 == 0) {
                    AbstractC2829l.crashlytics(obj7);
                    if (obj instanceof C15021l) {
                        c5158l.f11207l = 1;
                        if (interfaceC9427l.isPro(obj, c5158l) == enumC9342l) {
                            return enumC9342l;
                        }
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
                if (interfaceC14029l instanceof C18111l) {
                    c18111l = (C18111l) interfaceC14029l;
                    int i15 = c18111l.f35406l;
                    if ((i15 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c18111l.f35406l = i15 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c18111l = new C18111l(this, interfaceC14029l);
                    }
                } else {
                    c18111l = new C18111l(this, interfaceC14029l);
                }
                Object obj8 = c18111l.f35407l;
                int i16 = c18111l.f35406l;
                if (i16 == 0) {
                    AbstractC2829l.crashlytics(obj8);
                    if (obj instanceof C4537l) {
                        c18111l.f35406l = 1;
                        if (interfaceC9427l.isPro(obj, c18111l) == enumC9342l) {
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
                if (interfaceC14029l instanceof C14320l) {
                    c14320l = (C14320l) interfaceC14029l;
                    int i17 = c14320l.f28051l;
                    if ((i17 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c14320l.f28051l = i17 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c14320l = new C14320l(this, interfaceC14029l);
                    }
                } else {
                    c14320l = new C14320l(this, interfaceC14029l);
                }
                Object obj9 = c14320l.f28052l;
                int i18 = c14320l.f28051l;
                if (i18 == 0) {
                    AbstractC2829l.crashlytics(obj9);
                    if (obj instanceof C10288l) {
                        c14320l.f28051l = 1;
                        if (interfaceC9427l.isPro(obj, c14320l) == enumC9342l) {
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
                if (interfaceC14029l instanceof C10172l) {
                    c10172l = (C10172l) interfaceC14029l;
                    int i19 = c10172l.f20706l;
                    if ((i19 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10172l.f20706l = i19 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10172l = new C10172l(this, interfaceC14029l);
                    }
                } else {
                    c10172l = new C10172l(this, interfaceC14029l);
                }
                Object obj10 = c10172l.f20707l;
                int i20 = c10172l.f20706l;
                if (i20 == 0) {
                    AbstractC2829l.crashlytics(obj10);
                    if (obj instanceof C3850l) {
                        c10172l.f20706l = 1;
                        if (interfaceC9427l.isPro(obj, c10172l) == enumC9342l) {
                            return enumC9342l;
                        }
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
                if (interfaceC14029l instanceof C15928l) {
                    c15928l = (C15928l) interfaceC14029l;
                    int i21 = c15928l.f31265l;
                    if ((i21 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c15928l.f31265l = i21 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c15928l = new C15928l(this, interfaceC14029l);
                    }
                } else {
                    c15928l = new C15928l(this, interfaceC14029l);
                }
                Object obj11 = c15928l.f31266l;
                int i22 = c15928l.f31265l;
                if (i22 == 0) {
                    AbstractC2829l.crashlytics(obj11);
                    if (obj instanceof C8949l) {
                        c15928l.f31265l = 1;
                        if (interfaceC9427l.isPro(obj, c15928l) == enumC9342l) {
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
                if (interfaceC14029l instanceof C12361l) {
                    c12361l = (C12361l) interfaceC14029l;
                    int i23 = c12361l.f24454l;
                    if ((i23 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c12361l.f24454l = i23 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c12361l = new C12361l(this, interfaceC14029l);
                    }
                } else {
                    c12361l = new C12361l(this, interfaceC14029l);
                }
                Object obj12 = c12361l.f24455l;
                int i24 = c12361l.f24454l;
                if (i24 == 0) {
                    AbstractC2829l.crashlytics(obj12);
                    if (obj instanceof C12741l) {
                        c12361l.f24454l = 1;
                        if (interfaceC9427l.isPro(obj, c12361l) == enumC9342l) {
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
                if (interfaceC14029l instanceof C10888l) {
                    c10888l = (C10888l) interfaceC14029l;
                    int i25 = c10888l.f22008l;
                    if ((i25 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10888l.f22008l = i25 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10888l = new C10888l(this, interfaceC14029l);
                    }
                } else {
                    c10888l = new C10888l(this, interfaceC14029l);
                }
                Object obj13 = c10888l.f22009l;
                int i26 = c10888l.f22008l;
                if (i26 == 0) {
                    AbstractC2829l.crashlytics(obj13);
                    Integer num = new Integer(((C15343l) obj).f30001l);
                    c10888l.f22008l = 1;
                    if (interfaceC9427l.isPro(num, c10888l) == enumC9342l) {
                        return enumC9342l;
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
                if (interfaceC14029l instanceof C3355l) {
                    c3355l = (C3355l) interfaceC14029l;
                    int i27 = c3355l.f7153l;
                    if ((i27 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c3355l.f7153l = i27 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c3355l = new C3355l(this, interfaceC14029l);
                    }
                } else {
                    c3355l = new C3355l(this, interfaceC14029l);
                }
                Object obj14 = c3355l.f7154l;
                int i28 = c3355l.f7153l;
                if (i28 == 0) {
                    AbstractC2829l.crashlytics(obj14);
                    if (obj instanceof C10088l) {
                        c3355l.f7153l = 1;
                        if (interfaceC9427l.isPro(obj, c3355l) == enumC9342l) {
                            return enumC9342l;
                        }
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
                if (interfaceC14029l instanceof C3564l) {
                    c3564l = (C3564l) interfaceC14029l;
                    int i29 = c3564l.f7494l;
                    if ((i29 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c3564l.f7494l = i29 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c3564l = new C3564l(this, interfaceC14029l);
                    }
                } else {
                    c3564l = new C3564l(this, interfaceC14029l);
                }
                Object obj15 = c3564l.f7495l;
                int i30 = c3564l.f7494l;
                if (i30 == 0) {
                    AbstractC2829l.crashlytics(obj15);
                    if (obj instanceof C10288l) {
                        c3564l.f7494l = 1;
                        if (interfaceC9427l.isPro(obj, c3564l) == enumC9342l) {
                            return enumC9342l;
                        }
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
                if (interfaceC14029l instanceof C12699l) {
                    c12699l = (C12699l) interfaceC14029l;
                    int i31 = c12699l.f25018l;
                    if ((i31 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c12699l.f25018l = i31 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c12699l = new C12699l(this, interfaceC14029l);
                    }
                } else {
                    c12699l = new C12699l(this, interfaceC14029l);
                }
                Object obj16 = c12699l.f25019l;
                int i32 = c12699l.f25018l;
                if (i32 == 0) {
                    AbstractC2829l.crashlytics(obj16);
                    if (obj instanceof C3600l) {
                        c12699l.f25018l = 1;
                        if (interfaceC9427l.isPro(obj, c12699l) == enumC9342l) {
                            return enumC9342l;
                        }
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
                if (interfaceC14029l instanceof C12177l) {
                    c12177l = (C12177l) interfaceC14029l;
                    int i33 = c12177l.f24194l;
                    if ((i33 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c12177l.f24194l = i33 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c12177l = new C12177l(this, interfaceC14029l);
                    }
                } else {
                    c12177l = new C12177l(this, interfaceC14029l);
                }
                Object objSubscription = c12177l.f24195l;
                int i34 = c12177l.f24194l;
                if (i34 != 0) {
                    if (i34 == 1) {
                        i = c12177l.f24192l;
                        interfaceC9427l = c12177l.f24196l;
                        AbstractC2829l.crashlytics(objSubscription);
                    } else {
                        if (i34 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(objSubscription);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(objSubscription);
                C15718l c15718l = C15718l.f30869l;
                c12177l.f24196l = interfaceC9427l;
                c12177l.f24192l = 0;
                c12177l.f24194l = 1;
                objSubscription = c15718l.subscription((String) obj, c12177l);
                if (objSubscription == enumC9342l) {
                    return enumC9342l;
                }
                i = 0;
                c12177l.f24196l = null;
                c12177l.f24192l = i;
                c12177l.f24194l = 2;
                if (interfaceC9427l.isPro(objSubscription, c12177l) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 16:
                if (interfaceC14029l instanceof C16848l) {
                    c16848l = (C16848l) interfaceC14029l;
                    int i35 = c16848l.f32880l;
                    if ((i35 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c16848l.f32880l = i35 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c16848l = new C16848l(this, interfaceC14029l);
                    }
                } else {
                    c16848l = new C16848l(this, interfaceC14029l);
                }
                Object obj17 = c16848l.f32881l;
                int i36 = c16848l.f32880l;
                if (i36 == 0) {
                    AbstractC2829l.crashlytics(obj17);
                    InterfaceC13238l interfaceC13238lPurchase = AbstractC0509l.purchase(((C16480l) obj).yandex());
                    c16848l.f32880l = 1;
                    if (interfaceC9427l.isPro(interfaceC13238lPurchase, c16848l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i36 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj17);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (interfaceC14029l instanceof C16945l) {
                    c16945l = (C16945l) interfaceC14029l;
                    int i37 = c16945l.f33054l;
                    if ((i37 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c16945l.f33054l = i37 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c16945l = new C16945l(this, interfaceC14029l);
                    }
                } else {
                    c16945l = new C16945l(this, interfaceC14029l);
                }
                Object obj18 = c16945l.f33055l;
                int i38 = c16945l.f33054l;
                if (i38 == 0) {
                    AbstractC2829l.crashlytics(obj18);
                    InterfaceC13238l interfaceC13238lPurchase2 = AbstractC0509l.purchase(((C16480l) obj).yandex());
                    c16945l.f33054l = 1;
                    if (interfaceC9427l.isPro(interfaceC13238lPurchase2, c16945l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i38 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj18);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (interfaceC14029l instanceof C14380l) {
                    c14380l = (C14380l) interfaceC14029l;
                    int i39 = c14380l.f28120l;
                    if ((i39 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c14380l.f28120l = i39 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c14380l = new C14380l(this, interfaceC14029l);
                    }
                } else {
                    c14380l = new C14380l(this, interfaceC14029l);
                }
                Object obj19 = c14380l.f28121l;
                int i40 = c14380l.f28120l;
                if (i40 == 0) {
                    AbstractC2829l.crashlytics(obj19);
                    CachedLibrary cachedLibrary = (CachedLibrary) AbstractC16901l.m4217extends(((C16480l) obj).yandex());
                    Iterable iterableYandex = cachedLibrary != null ? cachedLibrary.yandex() : null;
                    if (iterableYandex == null) {
                        iterableYandex = C2580l.f5619l;
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj20 : iterableYandex) {
                        if (hashSet.add(((CachedTrack) obj20).premium())) {
                            arrayList.add(obj20);
                        }
                    }
                    InterfaceC13238l interfaceC13238lPurchase3 = AbstractC0509l.purchase(AbstractC16901l.m4240super(arrayList));
                    c14380l.f28120l = 1;
                    if (interfaceC9427l.isPro(interfaceC13238lPurchase3, c14380l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i40 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj19);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                if (interfaceC14029l instanceof C9832l) {
                    c9832l = (C9832l) interfaceC14029l;
                    int i41 = c9832l.f20024l;
                    if ((i41 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c9832l.f20024l = i41 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c9832l = new C9832l(this, interfaceC14029l);
                    }
                } else {
                    c9832l = new C9832l(this, interfaceC14029l);
                }
                Object obj21 = c9832l.f20025l;
                int i42 = c9832l.f20024l;
                if (i42 == 0) {
                    AbstractC2829l.crashlytics(obj21);
                    if (obj instanceof C1320l) {
                        c9832l.f20024l = 1;
                        if (interfaceC9427l.isPro(obj, c9832l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i42 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj21);
                }
                return Unit.INSTANCE;
            case 20:
                if (interfaceC14029l instanceof C5208l) {
                    c5208l = (C5208l) interfaceC14029l;
                    int i43 = c5208l.f11284l;
                    if ((i43 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c5208l.f11284l = i43 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c5208l = new C5208l(this, interfaceC14029l);
                    }
                } else {
                    c5208l = new C5208l(this, interfaceC14029l);
                }
                Object obj22 = c5208l.f11285l;
                int i44 = c5208l.f11284l;
                if (i44 == 0) {
                    AbstractC2829l.crashlytics(obj22);
                    if (obj instanceof C5075l) {
                        c5208l.f11284l = 1;
                        if (interfaceC9427l.isPro(obj, c5208l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i44 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj22);
                }
                return Unit.INSTANCE;
            case 21:
                if (interfaceC14029l instanceof C4174l) {
                    c4174l = (C4174l) interfaceC14029l;
                    int i45 = c4174l.f8566l;
                    if ((i45 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4174l.f8566l = i45 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c4174l = new C4174l(this, interfaceC14029l);
                    }
                } else {
                    c4174l = new C4174l(this, interfaceC14029l);
                }
                Object obj23 = c4174l.f8567l;
                int i46 = c4174l.f8566l;
                if (i46 == 0) {
                    AbstractC2829l.crashlytics(obj23);
                    if (obj instanceof C1725l) {
                        c4174l.f8566l = 1;
                        if (interfaceC9427l.isPro(obj, c4174l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i46 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj23);
                }
                return Unit.INSTANCE;
            case 22:
                if (interfaceC14029l instanceof C0947l) {
                    c0947l = (C0947l) interfaceC14029l;
                    int i47 = c0947l.f2630l;
                    if ((i47 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c0947l.f2630l = i47 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c0947l = new C0947l(this, interfaceC14029l);
                    }
                } else {
                    c0947l = new C0947l(this, interfaceC14029l);
                }
                Object obj24 = c0947l.f2631l;
                int i48 = c0947l.f2630l;
                if (i48 == 0) {
                    AbstractC2829l.crashlytics(obj24);
                    if (obj instanceof C7106l) {
                        c0947l.f2630l = 1;
                        if (interfaceC9427l.isPro(obj, c0947l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i48 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj24);
                }
                return Unit.INSTANCE;
            case 23:
                if (interfaceC14029l instanceof C5545l) {
                    c5545l = (C5545l) interfaceC14029l;
                    int i49 = c5545l.f11827l;
                    if ((i49 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c5545l.f11827l = i49 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c5545l = new C5545l(this, interfaceC14029l);
                    }
                } else {
                    c5545l = new C5545l(this, interfaceC14029l);
                }
                Object obj25 = c5545l.f11828l;
                int i50 = c5545l.f11827l;
                if (i50 == 0) {
                    AbstractC2829l.crashlytics(obj25);
                    if (obj instanceof C12879l) {
                        c5545l.f11827l = 1;
                        if (interfaceC9427l.isPro(obj, c5545l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i50 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj25);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                if (interfaceC14029l instanceof C14351l) {
                    c14351l = (C14351l) interfaceC14029l;
                    int i51 = c14351l.f28099l;
                    if ((i51 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c14351l.f28099l = i51 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c14351l = new C14351l(this, interfaceC14029l);
                    }
                } else {
                    c14351l = new C14351l(this, interfaceC14029l);
                }
                Object obj26 = c14351l.f28100l;
                int i52 = c14351l.f28099l;
                if (i52 == 0) {
                    AbstractC2829l.crashlytics(obj26);
                    if (obj instanceof C11134l) {
                        c14351l.f28099l = 1;
                        if (interfaceC9427l.isPro(obj, c14351l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i52 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj26);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                if (interfaceC14029l instanceof C8083l) {
                    c8083l = (C8083l) interfaceC14029l;
                    int i53 = c8083l.f16847l;
                    if ((i53 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c8083l.f16847l = i53 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c8083l = new C8083l(this, interfaceC14029l);
                    }
                } else {
                    c8083l = new C8083l(this, interfaceC14029l);
                }
                Object obj27 = c8083l.f16848l;
                int i54 = c8083l.f16847l;
                if (i54 == 0) {
                    AbstractC2829l.crashlytics(obj27);
                    if (obj instanceof InterfaceC15432l) {
                        c8083l.f16847l = 1;
                        if (interfaceC9427l.isPro(obj, c8083l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i54 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj27);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                if (interfaceC14029l instanceof C15073l) {
                    c15073l = (C15073l) interfaceC14029l;
                    int i55 = c15073l.f29605l;
                    if ((i55 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c15073l.f29605l = i55 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c15073l = new C15073l(this, interfaceC14029l);
                    }
                } else {
                    c15073l = new C15073l(this, interfaceC14029l);
                }
                Object obj28 = c15073l.f29606l;
                int i56 = c15073l.f29605l;
                if (i56 == 0) {
                    AbstractC2829l.crashlytics(obj28);
                    if (obj instanceof C9098l) {
                        c15073l.f29605l = 1;
                        if (interfaceC9427l.isPro(obj, c15073l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i56 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj28);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                if (interfaceC14029l instanceof C10906l) {
                    c10906l = (C10906l) interfaceC14029l;
                    int i57 = c10906l.f22030l;
                    if ((i57 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10906l.f22030l = i57 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10906l = new C10906l(this, interfaceC14029l);
                    }
                } else {
                    c10906l = new C10906l(this, interfaceC14029l);
                }
                Object obj29 = c10906l.f22031l;
                int i58 = c10906l.f22030l;
                if (i58 == 0) {
                    AbstractC2829l.crashlytics(obj29);
                    if (obj instanceof C4097l) {
                        c10906l.f22030l = 1;
                        if (interfaceC9427l.isPro(obj, c10906l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i58 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj29);
                }
                return Unit.INSTANCE;
            default:
                if (interfaceC14029l instanceof C4754l) {
                    c4754l = (C4754l) interfaceC14029l;
                    int i59 = c4754l.f9778l;
                    if ((i59 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4754l.f9778l = i59 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c4754l = new C4754l(this, interfaceC14029l);
                    }
                } else {
                    c4754l = new C4754l(this, interfaceC14029l);
                }
                Object obj30 = c4754l.f9779l;
                int i60 = c4754l.f9778l;
                if (i60 == 0) {
                    AbstractC2829l.crashlytics(obj30);
                    if (obj instanceof C6946l) {
                        c4754l.f9778l = 1;
                        if (interfaceC9427l.isPro(obj, c4754l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i60 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj30);
                }
                return Unit.INSTANCE;
        }
    }
}

package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lًۚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8242l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9427l f17131l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17132l;

    public /* synthetic */ C8242l(InterfaceC9427l interfaceC9427l, int i) {
        this.f17132l = i;
        this.f17131l = interfaceC9427l;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x015b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0195  */
    /* JADX WARN: Code duplicated, block: B:138:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:156:0x0209  */
    /* JADX WARN: Code duplicated, block: B:174:0x0243  */
    /* JADX WARN: Code duplicated, block: B:192:0x027d  */
    /* JADX WARN: Code duplicated, block: B:210:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:228:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:246:0x0329  */
    /* JADX WARN: Code duplicated, block: B:264:0x0363  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:282:0x039d  */
    /* JADX WARN: Code duplicated, block: B:300:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:318:0x0411  */
    /* JADX WARN: Code duplicated, block: B:336:0x044b  */
    /* JADX WARN: Code duplicated, block: B:354:0x0485  */
    /* JADX WARN: Code duplicated, block: B:372:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:390:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:408:0x0533  */
    /* JADX WARN: Code duplicated, block: B:440:0x0594  */
    /* JADX WARN: Code duplicated, block: B:456:0x05da  */
    /* JADX WARN: Code duplicated, block: B:474:0x0614  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:492:0x064e  */
    /* JADX WARN: Code duplicated, block: B:510:0x0688  */
    /* JADX WARN: Code duplicated, block: B:528:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:546:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0121  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) throws Throwable {
        C6883l c6883l;
        C10817l c10817l;
        C7398l c7398l;
        C17789l c17789l;
        C10827l c10827l;
        C18726l c18726l;
        C15192l c15192l;
        C0721l c0721l;
        C11151l c11151l;
        C5462l c5462l;
        C1191l c1191l;
        C4037l c4037l;
        C5874l c5874l;
        C1661l c1661l;
        C18398l c18398l;
        C4915l c4915l;
        C4546l c4546l;
        C13004l c13004l;
        C16038l c16038l;
        C15151l c15151l;
        C5790l c5790l;
        C5308l c5308l;
        C16894l c16894l;
        C18486l c18486l;
        C16284l c16284l;
        C4564l c4564l;
        C0778l c0778l;
        C5585l c5585l;
        C1144l c1144l;
        C18246l c18246l;
        int i = this.f17132l;
        InterfaceC9427l interfaceC9427l = this.f17131l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                if (interfaceC14029l instanceof C6883l) {
                    c6883l = (C6883l) interfaceC14029l;
                    int i2 = c6883l.f14415l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c6883l.f14415l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c6883l = new C6883l(this, interfaceC14029l);
                    }
                } else {
                    c6883l = new C6883l(this, interfaceC14029l);
                }
                Object obj2 = c6883l.f14416l;
                int i3 = c6883l.f14415l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj2);
                    if (obj instanceof C11841l) {
                        c6883l.f14415l = 1;
                        if (interfaceC9427l.isPro(obj, c6883l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj2);
                }
                return Unit.INSTANCE;
            case 1:
                if (interfaceC14029l instanceof C10817l) {
                    c10817l = (C10817l) interfaceC14029l;
                    int i4 = c10817l.f21861l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10817l.f21861l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10817l = new C10817l(this, interfaceC14029l);
                    }
                } else {
                    c10817l = new C10817l(this, interfaceC14029l);
                }
                Object obj3 = c10817l.f21862l;
                int i5 = c10817l.f21861l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj3);
                    if (obj instanceof C1725l) {
                        c10817l.f21861l = 1;
                        if (interfaceC9427l.isPro(obj, c10817l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj3);
                }
                return Unit.INSTANCE;
            case 2:
                if (interfaceC14029l instanceof C7398l) {
                    c7398l = (C7398l) interfaceC14029l;
                    int i6 = c7398l.f15327l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c7398l.f15327l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c7398l = new C7398l(this, interfaceC14029l);
                    }
                } else {
                    c7398l = new C7398l(this, interfaceC14029l);
                }
                Object obj4 = c7398l.f15328l;
                int i7 = c7398l.f15327l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj4);
                    if (obj instanceof C11134l) {
                        c7398l.f15327l = 1;
                        if (interfaceC9427l.isPro(obj, c7398l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj4);
                }
                return Unit.INSTANCE;
            case 3:
                if (interfaceC14029l instanceof C17789l) {
                    c17789l = (C17789l) interfaceC14029l;
                    int i8 = c17789l.f34651l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c17789l.f34651l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c17789l = new C17789l(this, interfaceC14029l);
                    }
                } else {
                    c17789l = new C17789l(this, interfaceC14029l);
                }
                Object obj5 = c17789l.f34652l;
                int i9 = c17789l.f34651l;
                if (i9 == 0) {
                    AbstractC2829l.crashlytics(obj5);
                    if (obj instanceof C14759l) {
                        c17789l.f34651l = 1;
                        if (interfaceC9427l.isPro(obj, c17789l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i9 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj5);
                }
                return Unit.INSTANCE;
            case 4:
                if (interfaceC14029l instanceof C10827l) {
                    c10827l = (C10827l) interfaceC14029l;
                    int i10 = c10827l.f21883l;
                    if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10827l.f21883l = i10 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10827l = new C10827l(this, interfaceC14029l);
                    }
                } else {
                    c10827l = new C10827l(this, interfaceC14029l);
                }
                Object obj6 = c10827l.f21884l;
                int i11 = c10827l.f21883l;
                if (i11 == 0) {
                    AbstractC2829l.crashlytics(obj6);
                    if (obj instanceof C5075l) {
                        c10827l.f21883l = 1;
                        if (interfaceC9427l.isPro(obj, c10827l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj6);
                }
                return Unit.INSTANCE;
            case 5:
                if (interfaceC14029l instanceof C18726l) {
                    c18726l = (C18726l) interfaceC14029l;
                    int i12 = c18726l.f36507l;
                    if ((i12 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c18726l.f36507l = i12 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c18726l = new C18726l(this, interfaceC14029l);
                    }
                } else {
                    c18726l = new C18726l(this, interfaceC14029l);
                }
                Object obj7 = c18726l.f36508l;
                int i13 = c18726l.f36507l;
                if (i13 == 0) {
                    AbstractC2829l.crashlytics(obj7);
                    if (obj instanceof C7685l) {
                        c18726l.f36507l = 1;
                        if (interfaceC9427l.isPro(obj, c18726l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj7);
                }
                return Unit.INSTANCE;
            case 6:
                if (interfaceC14029l instanceof C15192l) {
                    c15192l = (C15192l) interfaceC14029l;
                    int i14 = c15192l.f29782l;
                    if ((i14 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c15192l.f29782l = i14 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c15192l = new C15192l(this, interfaceC14029l);
                    }
                } else {
                    c15192l = new C15192l(this, interfaceC14029l);
                }
                Object obj8 = c15192l.f29783l;
                int i15 = c15192l.f29782l;
                if (i15 == 0) {
                    AbstractC2829l.crashlytics(obj8);
                    Long l = new Long(((C16480l) obj).yandex().size());
                    c15192l.f29782l = 1;
                    if (interfaceC9427l.isPro(l, c15192l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i15 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj8);
                }
                return Unit.INSTANCE;
            case 7:
                if (interfaceC14029l instanceof C0721l) {
                    c0721l = (C0721l) interfaceC14029l;
                    int i16 = c0721l.f2212l;
                    if ((i16 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c0721l.f2212l = i16 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c0721l = new C0721l(this, interfaceC14029l);
                    }
                } else {
                    c0721l = new C0721l(this, interfaceC14029l);
                }
                Object obj9 = c0721l.f2213l;
                int i17 = c0721l.f2212l;
                if (i17 != 0) {
                    if (i17 == 1) {
                        AbstractC2829l.crashlytics(obj9);
                        return Unit.INSTANCE;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj9);
                AbstractC12669l abstractC12669l = (AbstractC12669l) obj;
                if (abstractC12669l instanceof C1046l) {
                    throw ((C1046l) abstractC12669l).loadAd;
                }
                if (abstractC12669l instanceof C2856l) {
                    Object obj10 = ((C2856l) abstractC12669l).loadAd;
                    c0721l.f2212l = 1;
                    if (interfaceC9427l.isPro(obj10, c0721l) == enumC9342l) {
                        return enumC9342l;
                    }
                    return Unit.INSTANCE;
                }
                if ((abstractC12669l instanceof C15647l) || (abstractC12669l instanceof C3489l) || (abstractC12669l instanceof C11577l)) {
                    C8339l.smaato("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                } else {
                    C18725l.billing();
                }
                return null;
            case 8:
                if (interfaceC14029l instanceof C11151l) {
                    c11151l = (C11151l) interfaceC14029l;
                    int i18 = c11151l.f22424l;
                    if ((i18 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c11151l.f22424l = i18 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c11151l = new C11151l(this, interfaceC14029l);
                    }
                } else {
                    c11151l = new C11151l(this, interfaceC14029l);
                }
                Object obj11 = c11151l.f22425l;
                int i19 = c11151l.f22424l;
                if (i19 == 0) {
                    AbstractC2829l.crashlytics(obj11);
                    if (obj instanceof C1725l) {
                        c11151l.f22424l = 1;
                        if (interfaceC9427l.isPro(obj, c11151l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i19 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj11);
                }
                return Unit.INSTANCE;
            case 9:
                if (interfaceC14029l instanceof C5462l) {
                    c5462l = (C5462l) interfaceC14029l;
                    int i20 = c5462l.f11699l;
                    if ((i20 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c5462l.f11699l = i20 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c5462l = new C5462l(this, interfaceC14029l);
                    }
                } else {
                    c5462l = new C5462l(this, interfaceC14029l);
                }
                Object obj12 = c5462l.f11700l;
                int i21 = c5462l.f11699l;
                if (i21 == 0) {
                    AbstractC2829l.crashlytics(obj12);
                    if (obj instanceof C1725l) {
                        c5462l.f11699l = 1;
                        if (interfaceC9427l.isPro(obj, c5462l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i21 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj12);
                }
                return Unit.INSTANCE;
            case 10:
                if (interfaceC14029l instanceof C1191l) {
                    c1191l = (C1191l) interfaceC14029l;
                    int i22 = c1191l.f3182l;
                    if ((i22 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c1191l.f3182l = i22 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c1191l = new C1191l(this, interfaceC14029l);
                    }
                } else {
                    c1191l = new C1191l(this, interfaceC14029l);
                }
                Object obj13 = c1191l.f3183l;
                int i23 = c1191l.f3182l;
                if (i23 == 0) {
                    AbstractC2829l.crashlytics(obj13);
                    if (obj instanceof C11134l) {
                        c1191l.f3182l = 1;
                        if (interfaceC9427l.isPro(obj, c1191l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i23 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj13);
                }
                return Unit.INSTANCE;
            case 11:
                if (interfaceC14029l instanceof C4037l) {
                    c4037l = (C4037l) interfaceC14029l;
                    int i24 = c4037l.f8317l;
                    if ((i24 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4037l.f8317l = i24 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c4037l = new C4037l(this, interfaceC14029l);
                    }
                } else {
                    c4037l = new C4037l(this, interfaceC14029l);
                }
                Object obj14 = c4037l.f8318l;
                int i25 = c4037l.f8317l;
                if (i25 == 0) {
                    AbstractC2829l.crashlytics(obj14);
                    if (obj instanceof C14759l) {
                        c4037l.f8317l = 1;
                        if (interfaceC9427l.isPro(obj, c4037l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i25 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj14);
                }
                return Unit.INSTANCE;
            case 12:
                if (interfaceC14029l instanceof C5874l) {
                    c5874l = (C5874l) interfaceC14029l;
                    int i26 = c5874l.f12372l;
                    if ((i26 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c5874l.f12372l = i26 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c5874l = new C5874l(this, interfaceC14029l);
                    }
                } else {
                    c5874l = new C5874l(this, interfaceC14029l);
                }
                Object obj15 = c5874l.f12373l;
                int i27 = c5874l.f12372l;
                if (i27 == 0) {
                    AbstractC2829l.crashlytics(obj15);
                    if (obj instanceof C5075l) {
                        c5874l.f12372l = 1;
                        if (interfaceC9427l.isPro(obj, c5874l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i27 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj15);
                }
                return Unit.INSTANCE;
            case 13:
                if (interfaceC14029l instanceof C1661l) {
                    c1661l = (C1661l) interfaceC14029l;
                    int i28 = c1661l.f4016l;
                    if ((i28 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c1661l.f4016l = i28 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c1661l = new C1661l(this, interfaceC14029l);
                    }
                } else {
                    c1661l = new C1661l(this, interfaceC14029l);
                }
                Object obj16 = c1661l.f4017l;
                int i29 = c1661l.f4016l;
                if (i29 == 0) {
                    AbstractC2829l.crashlytics(obj16);
                    if (obj instanceof C17098l) {
                        c1661l.f4016l = 1;
                        if (interfaceC9427l.isPro(obj, c1661l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i29 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj16);
                }
                return Unit.INSTANCE;
            case 14:
                if (interfaceC14029l instanceof C18398l) {
                    c18398l = (C18398l) interfaceC14029l;
                    int i30 = c18398l.f35936l;
                    if ((i30 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c18398l.f35936l = i30 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c18398l = new C18398l(this, interfaceC14029l);
                    }
                } else {
                    c18398l = new C18398l(this, interfaceC14029l);
                }
                Object obj17 = c18398l.f35937l;
                int i31 = c18398l.f35936l;
                if (i31 == 0) {
                    AbstractC2829l.crashlytics(obj17);
                    if (obj instanceof C0241l) {
                        c18398l.f35936l = 1;
                        if (interfaceC9427l.isPro(obj, c18398l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i31 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj17);
                }
                return Unit.INSTANCE;
            case 15:
                if (interfaceC14029l instanceof C4915l) {
                    c4915l = (C4915l) interfaceC14029l;
                    int i32 = c4915l.f10007l;
                    if ((i32 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4915l.f10007l = i32 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c4915l = new C4915l(this, interfaceC14029l);
                    }
                } else {
                    c4915l = new C4915l(this, interfaceC14029l);
                }
                Object obj18 = c4915l.f10008l;
                int i33 = c4915l.f10007l;
                if (i33 == 0) {
                    AbstractC2829l.crashlytics(obj18);
                    if (obj instanceof C0590l) {
                        c4915l.f10007l = 1;
                        if (interfaceC9427l.isPro(obj, c4915l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i33 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj18);
                }
                return Unit.INSTANCE;
            case 16:
                if (interfaceC14029l instanceof C4546l) {
                    c4546l = (C4546l) interfaceC14029l;
                    int i34 = c4546l.f9189l;
                    if ((i34 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4546l.f9189l = i34 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c4546l = new C4546l(this, interfaceC14029l);
                    }
                } else {
                    c4546l = new C4546l(this, interfaceC14029l);
                }
                Object obj19 = c4546l.f9190l;
                int i35 = c4546l.f9189l;
                if (i35 == 0) {
                    AbstractC2829l.crashlytics(obj19);
                    if (obj instanceof C17684l) {
                        c4546l.f9189l = 1;
                        if (interfaceC9427l.isPro(obj, c4546l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i35 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj19);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (interfaceC14029l instanceof C13004l) {
                    c13004l = (C13004l) interfaceC14029l;
                    int i36 = c13004l.f25477l;
                    if ((i36 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c13004l.f25477l = i36 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c13004l = new C13004l(this, interfaceC14029l);
                    }
                } else {
                    c13004l = new C13004l(this, interfaceC14029l);
                }
                Object obj20 = c13004l.f25478l;
                int i37 = c13004l.f25477l;
                if (i37 == 0) {
                    AbstractC2829l.crashlytics(obj20);
                    if (obj instanceof C8350l) {
                        c13004l.f25477l = 1;
                        if (interfaceC9427l.isPro(obj, c13004l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i37 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj20);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (interfaceC14029l instanceof C16038l) {
                    c16038l = (C16038l) interfaceC14029l;
                    int i38 = c16038l.f31426l;
                    if ((i38 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c16038l.f31426l = i38 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c16038l = new C16038l(this, interfaceC14029l);
                    }
                } else {
                    c16038l = new C16038l(this, interfaceC14029l);
                }
                Object obj21 = c16038l.f31427l;
                int i39 = c16038l.f31426l;
                if (i39 == 0) {
                    AbstractC2829l.crashlytics(obj21);
                    if (obj instanceof C11935l) {
                        c16038l.f31426l = 1;
                        if (interfaceC9427l.isPro(obj, c16038l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i39 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj21);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                if (interfaceC14029l instanceof C15151l) {
                    c15151l = (C15151l) interfaceC14029l;
                    int i40 = c15151l.f29717l;
                    if ((i40 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c15151l.f29717l = i40 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c15151l = new C15151l(this, interfaceC14029l);
                    }
                } else {
                    c15151l = new C15151l(this, interfaceC14029l);
                }
                Object obj22 = c15151l.f29718l;
                int i41 = c15151l.f29717l;
                if (i41 == 0) {
                    AbstractC2829l.crashlytics(obj22);
                    if (obj != null) {
                        c15151l.f29717l = 1;
                        if (interfaceC9427l.isPro(obj, c15151l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i41 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj22);
                }
                return Unit.INSTANCE;
            case 20:
                if (interfaceC14029l instanceof C5790l) {
                    c5790l = (C5790l) interfaceC14029l;
                    int i42 = c5790l.f12204l;
                    if ((i42 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c5790l.f12204l = i42 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c5790l = new C5790l(this, interfaceC14029l);
                    }
                } else {
                    c5790l = new C5790l(this, interfaceC14029l);
                }
                Object obj23 = c5790l.f12205l;
                int i43 = c5790l.f12204l;
                if (i43 == 0) {
                    AbstractC2829l.crashlytics(obj23);
                    if (obj instanceof C11134l) {
                        c5790l.f12204l = 1;
                        if (interfaceC9427l.isPro(obj, c5790l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i43 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj23);
                }
                return Unit.INSTANCE;
            case 21:
                if (interfaceC14029l instanceof C5308l) {
                    c5308l = (C5308l) interfaceC14029l;
                    int i44 = c5308l.f11426l;
                    if ((i44 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c5308l.f11426l = i44 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c5308l = new C5308l(this, interfaceC14029l);
                    }
                } else {
                    c5308l = new C5308l(this, interfaceC14029l);
                }
                Object obj24 = c5308l.f11427l;
                int i45 = c5308l.f11426l;
                if (i45 == 0) {
                    AbstractC2829l.crashlytics(obj24);
                    if (obj instanceof C13865l) {
                        c5308l.f11426l = 1;
                        if (interfaceC9427l.isPro(obj, c5308l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i45 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj24);
                }
                return Unit.INSTANCE;
            case 22:
                if (interfaceC14029l instanceof C16894l) {
                    c16894l = (C16894l) interfaceC14029l;
                    int i46 = c16894l.f32948l;
                    if ((i46 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c16894l.f32948l = i46 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c16894l = new C16894l(this, interfaceC14029l);
                    }
                } else {
                    c16894l = new C16894l(this, interfaceC14029l);
                }
                Object obj25 = c16894l.f32949l;
                int i47 = c16894l.f32948l;
                if (i47 == 0) {
                    AbstractC2829l.crashlytics(obj25);
                    if (obj instanceof C1725l) {
                        c16894l.f32948l = 1;
                        if (interfaceC9427l.isPro(obj, c16894l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i47 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj25);
                }
                return Unit.INSTANCE;
            case 23:
                if (interfaceC14029l instanceof C18486l) {
                    c18486l = (C18486l) interfaceC14029l;
                    int i48 = c18486l.f36106l;
                    if ((i48 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c18486l.f36106l = i48 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c18486l = new C18486l(this, interfaceC14029l);
                    }
                } else {
                    c18486l = new C18486l(this, interfaceC14029l);
                }
                Object obj26 = c18486l.f36107l;
                int i49 = c18486l.f36106l;
                if (i49 == 0) {
                    AbstractC2829l.crashlytics(obj26);
                    if (obj instanceof C14759l) {
                        c18486l.f36106l = 1;
                        if (interfaceC9427l.isPro(obj, c18486l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i49 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj26);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                if (interfaceC14029l instanceof C16284l) {
                    c16284l = (C16284l) interfaceC14029l;
                    int i50 = c16284l.f31882l;
                    if ((i50 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c16284l.f31882l = i50 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c16284l = new C16284l(this, interfaceC14029l);
                    }
                } else {
                    c16284l = new C16284l(this, interfaceC14029l);
                }
                Object obj27 = c16284l.f31883l;
                int i51 = c16284l.f31882l;
                if (i51 == 0) {
                    AbstractC2829l.crashlytics(obj27);
                    if (obj instanceof C15553l) {
                        c16284l.f31882l = 1;
                        if (interfaceC9427l.isPro(obj, c16284l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i51 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj27);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                if (interfaceC14029l instanceof C4564l) {
                    c4564l = (C4564l) interfaceC14029l;
                    int i52 = c4564l.f9250l;
                    if ((i52 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4564l.f9250l = i52 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c4564l = new C4564l(this, interfaceC14029l);
                    }
                } else {
                    c4564l = new C4564l(this, interfaceC14029l);
                }
                Object obj28 = c4564l.f9251l;
                int i53 = c4564l.f9250l;
                if (i53 == 0) {
                    AbstractC2829l.crashlytics(obj28);
                    if (obj instanceof C3689l) {
                        c4564l.f9250l = 1;
                        if (interfaceC9427l.isPro(obj, c4564l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i53 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj28);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                if (interfaceC14029l instanceof C0778l) {
                    c0778l = (C0778l) interfaceC14029l;
                    int i54 = c0778l.f2356l;
                    if ((i54 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c0778l.f2356l = i54 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c0778l = new C0778l(this, interfaceC14029l);
                    }
                } else {
                    c0778l = new C0778l(this, interfaceC14029l);
                }
                Object obj29 = c0778l.f2357l;
                int i55 = c0778l.f2356l;
                if (i55 == 0) {
                    AbstractC2829l.crashlytics(obj29);
                    if (obj instanceof C1725l) {
                        c0778l.f2356l = 1;
                        if (interfaceC9427l.isPro(obj, c0778l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i55 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj29);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                if (interfaceC14029l instanceof C5585l) {
                    c5585l = (C5585l) interfaceC14029l;
                    int i56 = c5585l.f11860l;
                    if ((i56 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c5585l.f11860l = i56 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c5585l = new C5585l(this, interfaceC14029l);
                    }
                } else {
                    c5585l = new C5585l(this, interfaceC14029l);
                }
                Object obj30 = c5585l.f11861l;
                int i57 = c5585l.f11860l;
                if (i57 == 0) {
                    AbstractC2829l.crashlytics(obj30);
                    if (obj instanceof C14759l) {
                        c5585l.f11860l = 1;
                        if (interfaceC9427l.isPro(obj, c5585l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i57 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj30);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (interfaceC14029l instanceof C1144l) {
                    c1144l = (C1144l) interfaceC14029l;
                    int i58 = c1144l.f3109l;
                    if ((i58 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c1144l.f3109l = i58 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c1144l = new C1144l(this, interfaceC14029l);
                    }
                } else {
                    c1144l = new C1144l(this, interfaceC14029l);
                }
                Object obj31 = c1144l.f3110l;
                int i59 = c1144l.f3109l;
                if (i59 == 0) {
                    AbstractC2829l.crashlytics(obj31);
                    CachedPlaylist cachedPlaylist = (CachedPlaylist) AbstractC16901l.m4217extends(((C16480l) obj).yandex());
                    List listPurchase = cachedPlaylist != null ? cachedPlaylist.purchase() : null;
                    if (listPurchase == null) {
                        listPurchase = C2580l.f5619l;
                    }
                    InterfaceC13238l interfaceC13238lPurchase = AbstractC0509l.purchase(listPurchase);
                    c1144l.f3109l = 1;
                    if (interfaceC9427l.isPro(interfaceC13238lPurchase, c1144l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i59 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj31);
                }
                return Unit.INSTANCE;
            default:
                if (interfaceC14029l instanceof C18246l) {
                    c18246l = (C18246l) interfaceC14029l;
                    int i60 = c18246l.f35754l;
                    if ((i60 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c18246l.f35754l = i60 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c18246l = new C18246l(this, interfaceC14029l);
                    }
                } else {
                    c18246l = new C18246l(this, interfaceC14029l);
                }
                Object obj32 = c18246l.f35755l;
                int i61 = c18246l.f35754l;
                if (i61 == 0) {
                    AbstractC2829l.crashlytics(obj32);
                    if (!(((AbstractC18643l) obj) instanceof C4167l)) {
                        c18246l.f35754l = 1;
                        if (interfaceC9427l.isPro(obj, c18246l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i61 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj32);
                }
                return Unit.INSTANCE;
        }
    }
}
